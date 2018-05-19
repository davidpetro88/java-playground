package com.example.lambda.stream;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
	    List<String> someBingoNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29", "O71");
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


    }
}
