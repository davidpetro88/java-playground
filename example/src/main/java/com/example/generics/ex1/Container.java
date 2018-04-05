package com.example.generics.ex1;

public class Container<i1, i2> {

  private i1 item1;
  private i2 item2;

  public Container(i1 item1, i2 item2) {
    this.item1 = item1;
    this.item2 = item2;
  }

  public void printItems() {
    System.out.println("Print Contents of containers");
  }

  public i1 getItem1() {
    return item1;
  }

  public void setItem1(i1 item1) {
    this.item1 = item1;
  }

  public i2 getItem2() {
    return item2;
  }

  public void setItem2(i2 item2) {
    this.item2 = item2;
  }
}
