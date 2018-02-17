package com.example.collection.treepmap;

import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {
        TreeMap<String, String> dictionaryTreeMap = new TreeMap<String, String>();
        dictionaryTreeMap.put("first", "Description first");
        dictionaryTreeMap.put("second", "Description second");
        dictionaryTreeMap.put("third", "Description third");
        dictionaryTreeMap.put("fourth", "Description fourth");

        for(String word: dictionaryTreeMap.keySet()){
            System.out.println(dictionaryTreeMap.get(word));
        }

        System.out.println();

        for(Map.Entry<String, String> entry: dictionaryTreeMap.entrySet()){
            System.out.println("Key: "+ entry.getKey() + ", Value : " + entry.getValue());
        }
    }
}
