package com.example.thread.ex1;

public class Application {

    public static void main(String[] args) {
        System.out.println("Start thread 1");
        new Task("Thread-A").start();

        System.out.println("Start thread 2");
        new Task("Thread-B").start();
    }
}
