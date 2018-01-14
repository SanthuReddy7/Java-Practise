import java.util.Properties;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class FirstClient {
private Context context = null;
private ConnectionFactory factory = null;
private Connection connection = null;
private Destination destination = null;
private Session session = null;
private MessageProducer producer = null;

public FirstClient() {

}

public void sendObjectMessage() {

Properties initialProperties = new Properties();
initialProperties.put(InitialContext.INITIAL_CONTEXT_FACTORY,
"org.exolab.jms.jndi.InitialContextFactory");
initialProperties.put(InitialContext.PROVIDER_URL,
"tcp://localhost:3035");
try {

context = new InitialContext(initialProperties);
factory = (QueueConnectionFactory) context
.lookup("ConnectionFactory");
destination = (Queue) context.lookup("queue1");
connection = factory.createConnection();
session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
producer = session.createProducer(destination);
EventMessage eventMessage = new EventMessage(1,
"Message from FirstClient");
ObjectMessage objectMessage = session.createObjectMessage();
objectMessage.setObject(eventMessage);
connection.start();
producer.send(objectMessage);
System.out.println(this.getClass().getName()
+ "has sent a message : " + eventMessage);

} catch (NamingException e) {

e.printStackTrace();

} catch (JMSException e) {

e.printStackTrace();

}

if (context != null) {

try {

context.close();

} catch (NamingException ex) {

ex.printStackTrace();

}

}

if (connection != null) {

try {

connection.close();

} catch (JMSException ex) {

ex.printStackTrace();

}

}

}

public static void main(String[] args) {
FirstClient firstClient = new FirstClient();
firstClient.sendObjectMessage();
}

}