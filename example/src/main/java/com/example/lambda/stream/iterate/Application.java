package com.example.lambda.stream.iterate;

import java.util.stream.Stream;

public class Application {

  public static void main(String[] args) {
    Stream.iterate(1, x -> x + 1)
      .limit(3)
      .forEach(System.out::println);
  }
}
