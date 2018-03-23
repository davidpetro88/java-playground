package com.example.thread.ex5;

public class Worker extends Thread {
  private Sequence sequence = null;

  public Worker(String name, Sequence sequence) {
    super(name);
    this.sequence = sequence;
  }

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " got value: " + sequence.geNext());
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
