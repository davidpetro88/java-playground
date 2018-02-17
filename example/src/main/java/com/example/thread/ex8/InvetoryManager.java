package com.example.thread.ex8;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InvetoryManager {
    private volatile List<Product> soldProductList = new CopyOnWriteArrayList<>();

    public void populateSoldProducts() {
        for(int i= 0; i < 100; i++) {
            Product product = new Product(i, "test_product" + i);
            soldProductList.add(product);
            System.out.println("ADDED: " + product);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for(Product product: soldProductList){
            System.out.println("PRINTING THE SOLD: "+ product);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
