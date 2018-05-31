package com.streams.takeWhile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);

        System.out.println("Example 1");
        nums.stream().takeWhile(n -> n  <= 5).forEach(System.out::println);

        System.out.println("\n Example 2");
        nums.stream().takeWhile(n -> n  > 100).forEach(System.out::println);

        System.out.println("\n Example 3");
        Stream.iterate(1, x -> x <= 100, x -> x + 2).takeWhile(x -> x < 50).forEach(System.out::println);

        System.out.println("\n Example 4");
        List<String> strings = Arrays.asList("Cherry", "Oak", "Pine", "Spruce", "Walnut", "Willow");
        strings.stream().map(s -> s.toLowerCase()).takeWhile(s -> !s.startsWith("w")).forEach(System.out::println);
    }
}
