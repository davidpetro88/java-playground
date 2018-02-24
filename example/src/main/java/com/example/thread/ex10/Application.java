package com.example.thread.ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

    public static void main(String[] args) {

        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<>(5);

        Thread threadOne = new Thread(new Producer(questionQueue));
        Thread threadTwo = new Thread(new Consumer(questionQueue));

        threadOne.start();
        threadTwo.start();
    }
}
