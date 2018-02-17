package com.example.thread.ex2;

public class Application {

    public static void main(String[] args) {
        System.out.println("Start thread 1");
        new Thread(new Task("Thread-A")).start();

        System.out.println("Start thread 2");
        new Thread(new Task("Thread-B")).start();
    }
}
