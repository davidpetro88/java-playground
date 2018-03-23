package com.example.collection.linkedlist;

import java.util.LinkedList;

public class Application {

  public static void main(String[] args) {
    LinkedList<Integer> numbers = new LinkedList<Integer>();
    numbers.add(100);
    numbers.add(200);
    numbers.add(45);
    numbers.add(1000);
    numbers.stream().forEach(System.out::println);
  }
}
