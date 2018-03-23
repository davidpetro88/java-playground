package com.example.thread.ex2;

public class Task implements Runnable {

  private String name;

  public Task(String name) {
    this.name = name;
  }

  public void run() {
    Thread.currentThread().setName(name);
    for (int i = 0; i < 1000; i++) {
      System.out.println("Number :" + i + " - " + Thread.currentThread().getName());
    }
  }
}
