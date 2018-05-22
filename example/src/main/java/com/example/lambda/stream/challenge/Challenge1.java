package com.example.lambda.stream.challenge;

public class Challenge1 {

  public static void main(String[] args) {
    System.out.println("1 - Example.");
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        String myString = "Let's split this up into an array";
        String[] parts = myString.split(" ");
        for (String part : parts) {
          System.out.println(part);
        }
      }
    };
    runnable.run();

    System.out.println("\n ======================================================================");
    System.out.println("1 - Write the following anonymous class as a lambda expression.");
    Runnable runnable1 = () -> {
      String myString = "Let's split this up into an array";
      String[] parts = myString.split(" ");
      for (String part : parts) {
        System.out.println(part);
      }
    };
    runnable1.run();
  }
}
