package com.example.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {

  public static void main(String[] args) {
    System.out.println("\n First Example");
    Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
      .filter(s -> {
        System.out.println(s);
        return s.length() == 3;
      });

    System.out.println("\n Second Example");
    Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
      .filter(s -> {
        System.out.println(s);
        return s.length() == 3;
      })
      .count();

    System.out.println("-----------------------");

    List<String> someBingoNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G53", "G49", "G60", "G50", "g64",
      "I26", "I17", "I29", "O71");
    someBingoNumbers
      .stream()
      .map(String::toUpperCase)
      .filter(s -> s.startsWith("G"))
      .sorted()
      .forEach(System.out::println);

    System.out.println("-----------------------");
    Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
    Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
    System.out.printf("\n Total :" + Stream.concat(ioNumberStream, inNumberStream).count());

    System.out.println("\n -----------------------");
    System.out.println("Distinct");
    Stream<String> ioNumberStream2 = Stream.of("I26", "I17", "I29", "O71");
    Stream<String> inNumberStream2 = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
    System.out.println(Stream.concat(ioNumberStream2, inNumberStream2)
      .distinct()
      .peek(System.out::println)
      .count());
  }


}
