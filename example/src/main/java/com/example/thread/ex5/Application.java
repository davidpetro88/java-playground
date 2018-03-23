package com.example.thread.ex5;


/**
 * When run you can see don`t have repeat numbers.
 */
public class Application {

  public static void main(String[] args) {
    Sequence sequence = new Sequence();

    new Worker("Work_A", sequence).start();
    new Worker("Work_B", sequence).start();

  }
}
