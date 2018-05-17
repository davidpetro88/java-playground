package com.rabbit.mq.ex1.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.rabbit.mq.ex1.rabbitmq.model.TransactionEvent;
import com.rabbitmq.client.*;
import org.apache.log4j.Logger;
import org.springframework.core.env.Environment;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

public class Producer {

    private static final Logger logger = Logger.getLogger(Producer.class);
    private final static String QUEUE_NAME = "logs";
    private static final int TRANSACTIONS_PER_EVENT = 10;

    private ObjectMapper jsonMapper;
    private Channel channel;
    private Environment environment;

    public Producer(Environment environment) {
        this.jsonMapper = new ObjectMapper();
        this.environment = environment;
        this.connectToBroker();
    }

    public void run() {
        logger.info("Starter Producer.run ");
        List<Long> scheduledTransactionsToProcess = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
        if (!scheduledTransactionsToProcess.isEmpty()) {
            logger.info("Got " + scheduledTransactionsToProcess.size() + " new transactions");
            Lists.partition(scheduledTransactionsToProcess, TRANSACTIONS_PER_EVENT).stream()
                    .map(TransactionEvent::new)
                    .forEach(sendEventToBroker());
            logger.info("Events persisted");
        }
    }

    private void connectToBroker() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUsername(environment.getProperty("rabbitmq.username"));
            factory.setPassword(environment.getProperty("rabbitmq.password"));
            Connection connection = factory.newConnection(environment.getProperty("rabbitmq.brokers"));
            channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME, true, false, false, null);
            channel.confirmSelect();
        } catch (IOException | TimeoutException error) {

            System.out.println( "Username : " + environment.getProperty("rabbitmq.username"));
            System.out.println( "Password : " + environment.getProperty("rabbitmq.password"));
            System.out.println( "brokers : " + environment.getProperty("rabbitmq.brokers"));

//            error.printStackTrace();

            logger.info("Error opening channel with broker: " + error.getMessage());
            try {
                Thread.sleep(5000);
                connectToBroker();
            } catch (InterruptedException interrupt) {
                connectToBroker();
            }
        }
    }

    private Consumer<TransactionEvent> sendEventToBroker() {
        return event -> {
            try {
                channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, jsonMapper.writeValueAsBytes(event));
                waitBrokerAcknowledgement(event.getTransactions());
                logger.info(" [x] Sent: " + event);
            } catch (IOException error) {
                logger.info("Error producing event: " + error.getMessage());
            } catch (AlreadyClosedException error) {
                logger.info("Lost connection with broker: " + error.getMessage());
                connectToBroker();
            }
        };
    }

    private void waitBrokerAcknowledgement(List<Long> scheduledTransactionsToProcess) {
        try {
            if (channel.waitForConfirms()) {
                logger.info(" Producer ::: Wait For confirms id : " + scheduledTransactionsToProcess );
                //transactionData.setTransactionsStatusToProcessing(scheduledTransactionsToProcess);
            }
        } catch (InterruptedException error) {
            logger.info("Interrupted while waiting for broker delivery confirmation: " + error.getMessage());
        }
    }

}
