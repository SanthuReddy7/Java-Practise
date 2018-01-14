import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class MyTopicPublisher {
      private static final String TOPIC_CONN_FACTORY = "TopicConnectionFactory";
      private static final String TOPIC_NAME = "myTopic";
      private static Context jndiContext = null;
      private static TopicConnectionFactory topicConnectionFactory = null;
      public static void main(String[] args) {
            TopicConnection topicConnection = null;
            TopicSession topicSession = null;
            Topic topic = null;
            TopicPublisher topicPublisher = null;
            TextMessage message = null;
            try {
                  jndiContext = new InitialContext();      
                  topicConnectionFactory = (TopicConnectionFactory) jndiContext.lookup(TOPIC_CONN_FACTORY);
                  topic = (Topic) jndiContext.lookup(TOPIC_NAME);
            } catch (NamingException e) {
                  System.out.println("Not able to create JNDI context: " + e.toString());
                  System.exit(1);
            }
            try {
                  topicConnection = topicConnectionFactory.createTopicConnection();
                  topicSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
                  topicPublisher = topicSession.createPublisher(topic);
                  message = topicSession.createTextMessage();
                  for (int i = 0; i < 10; i++) {
                        message.setText("Test Message " + ++i);
                        System.out.println("Message getting published: " + message.getText());
                        topicPublisher.publish(message);
                  }
            } catch (JMSException e) {
                  System.out.println(e.getMessage());
            } finally {
                  if (null != topicConnection) {
                        try {
                              topicConnection.close();
                        } catch (JMSException e) {}
                  }
            }
      }
}