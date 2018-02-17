package com.example.thread.ex3;

public class Application {

    public static void main(String[] args) {
        System.out.println("Start thread 1");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 1000; i++){
                    System.out.println("Number :" + i + " - " + Thread.currentThread().getName());
                }
            }
        }).start();

        System.out.println("Start thread 2");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 1000; i++){
                    System.out.println("Number :" + i + " - " + Thread.currentThread().getName());
                }
            }
        }).start();
    }
}
