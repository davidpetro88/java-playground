package com.rabbitmq.ex2.schedule;

import com.rabbitmq.ex2.rabbitmq.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScheduleModule {

    @Bean
    public Schedule schedule(Producer producer) {
        return new Schedule(producer);
    }
}
