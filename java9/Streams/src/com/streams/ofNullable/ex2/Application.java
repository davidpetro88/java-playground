package com.streams.ofNullable.ex2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Application {

    public static void main(String[] args)  {

        Map<String, String> nickNames = new HashMap<>();
        nickNames.put("Frank", "Franky");
        nickNames.put("James", "JC");
        nickNames.put("Oscar", null);
        nickNames.put("Michael", "Mike");
        nickNames.put("Herb", "Herbie");
        nickNames.put("Elizabeth", "Liz");
        nickNames.put("Suzy", null);

        List<String> names = nickNames.entrySet()
                .stream()
                .map(e -> e.getKey())
                .collect(toList());
        System.out.println("Print Names");
        System.out.println(names);


        List<String> nick1 = nickNames.entrySet()
                .stream()
                .flatMap(e -> {
                    if (e.getValue() != null) {
                        return Stream.of(e.getValue());
                    } else {
                        return Stream.empty();
                    }
                })
                .collect(toList());
        System.out.println("\n Print nick Names Ex1");
        System.out.println(nick1);

        List<String> nick2 = nickNames.entrySet()
                .stream()
                .flatMap(e -> Stream.ofNullable(e.getValue()))
                .collect(toList());
        System.out.println("\n Print nick Names Ex2");
        System.out.println(nick2);


    }


}
