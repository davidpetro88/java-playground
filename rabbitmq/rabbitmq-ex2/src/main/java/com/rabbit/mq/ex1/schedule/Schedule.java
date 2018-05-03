package com.rabbit.mq.ex1.schedule;

import com.rabbit.mq.ex1.rabbitmq.Producer;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;

@AllArgsConstructor
public class Schedule {
    
    private Producer producer;

    @Scheduled(fixedDelayString = "1000")
    public void producerRun() {
        producer.run();
    }
}
