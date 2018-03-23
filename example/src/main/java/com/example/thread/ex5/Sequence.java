package com.example.thread.ex5;

public class Sequence {

  private int value = 0;

  public int geNext() {
    synchronized (this) {
      value++;
      return value;
    }
  }

}
