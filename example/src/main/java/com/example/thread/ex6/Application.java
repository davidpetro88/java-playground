package com.example.thread.ex6;

public class Application {

    public static void main(String[] args) {
        InvetoryManager manager = new InvetoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();
        try {
            Thread.sleep(20);
            displayTask.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
