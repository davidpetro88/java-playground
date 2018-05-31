package com.streams.ofNullable.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        System.out.println("\n Example 1");
        Stream<Integer> s1 = Stream.ofNullable(100);
        s1.forEach(System.out::println);

        Stream<Integer> s2 = Stream.ofNullable(null);
        s2.forEach(System.out::println);

        System.out.println("\n Example 2");
        List<Integer> integers = Arrays.asList(500, 600, 100, null, 200, null, 400, null);
        integers.stream().filter(e-> e != null).sorted().forEach(System.out::println);

        System.out.println("\n Example 3");
        integers.stream().flatMap(e -> Stream.ofNullable(e)).sorted().forEach(System.out::println);
    }
}
