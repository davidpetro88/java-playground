package com.example.thread.ex1;

public class Task extends Thread {

    public Task(String name) {
        super(name);
    }

    public void run() {
        for(int i =0; i < 1000; i++){
            System.out.println("Number :" + i + " - " + Thread.currentThread().getName());
        }
    }
}
