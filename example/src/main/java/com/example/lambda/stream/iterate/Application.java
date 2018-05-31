package com.example.lambda.stream.iterate;

import java.util.stream.Stream;

public class Application {

  public static void main(String[] args) {
    System.out.println("Example 1");
    Stream.iterate(1, x -> x + 1)
      .limit(3)
      .forEach(System.out::println);

    System.out.println("Example 2  With filter does not terminate!" );
    Stream.iterate(1, x -> x + 1)
      .filter(x -> x <=3 && x >0 )
      .forEach(System.out::println);
  }
}
