package com.example.thread.ex4;


/**
 * Example thread not safe
 */
public class Application {

  public static void main(String[] args) {
    Sequence sequence = new Sequence();

    new Worker("Work_A", sequence).start();
    new Worker("Work_B", sequence).start();

  }
}
