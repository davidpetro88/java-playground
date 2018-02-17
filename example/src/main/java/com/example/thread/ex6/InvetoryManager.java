package com.example.thread.ex6;

import java.util.ArrayList;
import java.util.List;

public class InvetoryManager {
    private List<Product> soldProductList = new ArrayList<>();

    public void populateSoldProducts() {
        for(int i= 0; i < 1000; i++) {
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
