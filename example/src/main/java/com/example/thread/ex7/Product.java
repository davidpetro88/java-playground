package com.example.thread.ex7;

public class Product {
  private int id;
  private String name;

  public Product(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "id: " + id + " | name: " + name;

  }
}
