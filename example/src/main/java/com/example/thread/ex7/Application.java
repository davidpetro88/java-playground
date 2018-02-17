package com.example.thread.ex7;

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
            inventoryTask.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        displayTask.start();
    }
}
