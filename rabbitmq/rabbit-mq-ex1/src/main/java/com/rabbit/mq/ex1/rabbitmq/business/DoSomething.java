package com.rabbit.mq.ex1.rabbitmq.business;

import com.rabbit.mq.ex1.rabbitmq.model.TransactionEvent;

public class DoSomething {

    public static void doSomething(TransactionEvent transactionEvent) {
        transactionEvent.getTransactions().forEach(id -> {
            System.out.println(" [x] Id :" + id);
        });
    }
}
