package com.raghu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class BasicJMSChat implements MessageListener {
	private JmsTemplate chatJMSTemplate;
	private Topic chatTopic;
	private static String userId;
	
	public static void main(String[] args) throws JMSException, IOException {

		if (args.length != 1) {
			System.out.println("User name required....");	
		}
		else {
			userId = args[0];
			ApplicationContext ctx = new ClassPathXmlApplicationContext("com/raghu/spring-config.xml");
			BasicJMSChat basicjmschat = (BasicJMSChat) ctx.getBean("BasicJMSChat");
			TopicConnectionFactory topicConnectionFactory = (TopicConnectionFactory) basicjmschat.chatJMSTemplate.getConnectionFactory();
			TopicConnection tc = topicConnectionFactory.createTopicConnection();
			basicjmschat.publish(tc, basicjmschat.chatTopic, userId);
			basicjmschat.subscribe(tc, basicjmschat.chatTopic, basicjmschat);
		}
		
	}
	
	void subscribe(TopicConnection topicConnection, Topic chatTopic, BasicJMSChat commandLineChat) throws JMSException {
		TopicSession tSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicSubscriber ts = tSession.createSubscriber(chatTopic);
		ts.setMessageListener(commandLineChat);
	}
	
	void publish(TopicConnection topicConnection, Topic chatTopic, String userId) throws JMSException, IOException {
		TopicSession tSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicPublisher topicPublisher = tSession.createPublisher(chatTopic);
		topicConnection.start();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String msgToSend = reader.readLine();
			if (msgToSend.equalsIgnoreCase("Exit")) {
				topicConnection.close();
				System.exit(0);
				
			}
			else {
				TextMessage msg = (TextMessage) tSession.createTextMessage();
				msg.setText("\n [" +userId +" :" +msgToSend + "]");
				topicPublisher.publish(msg);
				
			}
			
		}
	}
	
	
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			try {
				String msgText = ((TextMessage) message).getText();
				if(!msgText.startsWith("[" +userId)) System.out.println(msgText);
				
			}
			catch (JMSException e) {
				String errMsg = "An error occured extracting msg";
				e.printStackTrace();
			}
		}
		
		else {
			String errMsg="Message is not Expected type text message";
			System.err.println(errMsg);
			
			throw new RuntimeException(errMsg);
			
		}
		
		}
	
	public JmsTemplate getChatJmsTemplate(){
		return chatJMSTemplate;
		
	}
	public void setChatJmstemplate(JmsTemplate chatJmsTemplate){
		this.chatJMSTemplate = chatJmsTemplate;
	}
	

	
	
}
