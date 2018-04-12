package ex2;

import javax.jms.*;
import javax.naming.InitialContext;
import java.util.Scanner;

public class TestConsumer {

    public static void main(String[] args) throws Exception {

        InitialContext context = new InitialContext();
        ConnectionFactory factory = (ConnectionFactory) context.lookup("ConnectionFactory");

        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false,  Session.AUTO_ACKNOWLEDGE);

        Destination fila = (Destination) context.lookup("financial");
        MessageConsumer consumer = session.createConsumer(fila);

        Message receive = consumer.receive();

        System.out.println("Received message : " + receive);

        new Scanner(System.in).nextLine();

        session.close();
        connection.close();
        context.close();
    }
}
