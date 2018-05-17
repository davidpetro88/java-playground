package com.rabbit.mq.ex1.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbit.mq.ex1.rabbitmq.business.DoSomething;
import com.rabbit.mq.ex1.rabbitmq.model.TransactionEvent;
import com.rabbitmq.client.*;
import org.apache.log4j.Logger;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Consumer {
    private final static Logger logger = Logger.getLogger(Consumer.class);
    private final static String QUEUE_NAME = "logs";
    private final static int MAXIMUM_SIMULTANEOUS_MESSAGES = 1;

    private ObjectMapper jsonMapper;
    private Channel channel;
    private Environment environment;
    private ExecutorService executorService;

    public Consumer(Environment environment) {
        this.jsonMapper = new ObjectMapper();
        this.environment = environment;
        this.executorService = Executors.newFixedThreadPool(MAXIMUM_SIMULTANEOUS_MESSAGES);
        this.registerShutdownHook();
        this.connectToBroker();
    }

    public void run() {
        try {
            channel.basicConsume(QUEUE_NAME, false, consumer(channel));
        } catch (IOException error) {
            System.out.println("Error starter run");
            logger.error("Error receiving message: " + error.getMessage());
        }
    }

    private void connectToBroker() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername(environment.getProperty("rabbitmq.username"));
            factory.setPassword(environment.getProperty("rabbitmq.password"));
            Connection connection = factory.newConnection(environment.getProperty("rabbitmq.brokers"));
            channel = connection.createChannel();
            channel.basicQos(MAXIMUM_SIMULTANEOUS_MESSAGES, false);
            channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        } catch (IOException | TimeoutException error) {

            System.out.println( "Username : " + environment.getProperty("rabbitmq.username"));
            System.out.println( "Password : " + environment.getProperty("rabbitmq.password"));
            System.out.println( "brokers : " + environment.getProperty("rabbitmq.brokers"));


            logger.error("Error opening channel with broker: " + error.getMessage() + "\nTrying again...");
            try {
                Thread.sleep(5000);
                connectToBroker();
            } catch (InterruptedException interrupt) {
                connectToBroker();
            }
        }
    }

    private void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            executorService.shutdown();
            logger.info("Waiting executorService to finalize...");
            try {
                while (!executorService.awaitTermination(60, TimeUnit.SECONDS)) ;
                logger.info("executorService finalized");
            } catch (InterruptedException e) {
                logger.info("Interrupted while waiting for termination: " + e.getMessage());
            }
        }));
    }

    private DefaultConsumer consumer(Channel channel) {
        return new DefaultConsumer(channel) {
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                executorService.submit(() -> {
                    try {
                        TransactionEvent transactionEvent = jsonMapper.readValue(body, TransactionEvent.class);
                        logger.info(" [x] Receivet: " + transactionEvent.getTransactions().size());
                        DoSomething.doSomething(transactionEvent);
                        channel.basicAck(envelope.getDeliveryTag(), false);
                        logger.info("Transactions sent");
                    } catch (Exception error) {
                        logger.error("Error consuming event: " + error.getMessage());
                        try {
                            channel.basicNack(envelope.getDeliveryTag(), false, true);
                        } catch (IOException io) {
                            logger.error("Error sending nAck to broker: " + io.getMessage());
                        }
                    }
                });
            }
        };
    }

}
