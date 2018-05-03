package com.rabbit.mq.ex1.rabbitmq;

import com.rabbit.mq.ex1.rabbitmq.config.PropertieLoader;
import com.rabbit.mq.ex1.rabbitmq.model.CustomMessage;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.util.Random;

@AllArgsConstructor
public class Producer {

    private static final Logger log = LoggerFactory.getLogger(Producer.class);

    private final RabbitTemplate rabbitTemplate;
    private PropertieLoader propertieLoader;

    public void run () {
        final CustomMessage message = new CustomMessage("Hello there!", new Random().nextInt(50), false);
        log.info("Sending message...");
        rabbitTemplate.convertAndSend(propertieLoader.getExchangeName(), propertieLoader.getRoutingKey(), message);
    }
}
