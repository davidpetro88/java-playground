package com.example.lambda.stream.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {

  public static void main(String[] args) {

    List<String> topNames2015 = Arrays.asList(
      "Amelia",
      "Olivia",
      "emily",
      "Isla",
      "Ava",
      "oliver",
      "Jack",
      "Charlie",
      "harry",
      "Jacob"
    );

    System.out.println("First Letter Upper case and sorted.");
    topNames2015
      .stream()
      .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
      .sorted(String::compareTo)
      .forEach(System.out::println);

    long namesBeginningWithA = topNames2015
      .stream()
      .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
      .filter(name -> name.startsWith("A"))
      .count();
    System.out.println("\n Number of names beginning with A is: " + namesBeginningWithA);
  }
}
