package com.example.lambda.stream.sorted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

  public static void main(String[] args) {
    List<String> someBingoNumbers = Arrays.asList(
      "N40", "N36",
      "B12", "B6",
      "G53", "G49", "G60", "G50", "g64",
      "I26", "I17", "I29",
      "O71");

    List<String> sortedGNumbers = someBingoNumbers
      .stream()
      .map(String::toUpperCase)
      .filter(s -> s.startsWith("G"))
      .sorted()
      .collect(Collectors.toList());

    sortedGNumbers.forEach(System.out::println);

    System.out.println("---------------");

    List<String> sortedGNumbers2 = someBingoNumbers
      .stream()
      .map(String::toUpperCase)
      .filter(s -> s.startsWith("G"))
      .sorted()
      .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    sortedGNumbers2.forEach(System.out::println);
  }
}
