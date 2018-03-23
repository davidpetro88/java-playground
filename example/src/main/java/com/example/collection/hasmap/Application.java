package com.example.collection.hasmap;

import java.util.HashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("first", "Description first");
    dictionary.put("second", "Description second");
    dictionary.put("third", "Description third");
    dictionary.put("fourth", "Description fourth");

    for (String word : dictionary.keySet()) {
      System.out.println(dictionary.get(word));
    }

    System.out.println();

    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value : " + entry.getValue());
    }
  }
}
