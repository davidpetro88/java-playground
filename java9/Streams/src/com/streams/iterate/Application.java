package com.streams.iterate;

import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        System.out.println("Example 1");
        Stream.iterate(10, x -> x + 1).limit(6).forEach(System.out::println);

        System.out.println("\n Example 2");
        Stream.iterate(10, x -> x + 2).limit(6).forEach(System.out::println);

//        System.out.println("\n This won't terminate");
//        Stream.iterate(1, x -> x + 1).filter(x -> x <=3).forEach(System.out::println);

        System.out.println("\n Example 3");
        Stream.iterate(1, x -> x <= 100, x -> x + 2).forEach(System.out::println);

    }
}
