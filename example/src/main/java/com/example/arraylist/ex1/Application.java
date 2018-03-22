package com.example.arraylist.ex1;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("Hello");
        wordList.add("There");
        wordList.add("100");

        String item1= wordList.get(0);

        System.out.println("Get first element from array: " + item1);
        wordList.stream().forEach(System.out::println);
    }
}
