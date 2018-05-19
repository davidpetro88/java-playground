package com.example.lambda.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Application {

  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 3; i++) {
      System.out.println(random.nextInt(1000));
    }

    System.out.println("\n Randon Supplier");
    Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
    for (int i = 0; i < 3; i++) {
      System.out.println(randomSupplier.get());
    }
  }
}
