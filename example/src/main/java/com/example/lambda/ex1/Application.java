package com.example.lambda.ex1;

public class Application {
  public static void main(String[] args) {
    new Thread(new CodeToRun()).start();
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Printing from the Runnable ex:2");
      }
    }).start();
    new Thread(() -> System.out.println("Printing from the Runnable ex:3 Lambda")).start();
    new Thread(() ->{
      System.out.println("Printing from the Runnable ex:4 Lambda");
      System.out.println("Printing from the Runnable ex:4 Lambda");
    }).start();
  }
}

class CodeToRun implements Runnable {
  @Override
  public void run() {
    System.out.println("Printing from the Runnable ex:1");
  }
}
