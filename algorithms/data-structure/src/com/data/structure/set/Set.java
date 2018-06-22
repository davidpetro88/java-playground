package com.data.structure.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Set {

    private ArrayList<LinkedList<String>> table = new ArrayList();

    public Set() {
        // 26 is total number of the letters to the alphabet
        for (int i =0; i < 26; i++){
            table.add(new LinkedList<>());
        }
    }

    public void add(String word) {
        if(!contain(word)) {
            int indice = calculateIndiceOfTable(word);
            List<String> list = table.get(indice);
            list.add(word);
        }
    }

    public void remove(String word) {
        if(!contain(word)) {
            int indice = calculateIndiceOfTable(word);
            List<String> list = table.get(indice);
            list.remove(word);
        }
    }

    private boolean contain(String word) {
        int indice = calculateIndiceOfTable(word);
        return table.get(indice).contains(word);
    }

    private int calculateIndiceOfTable(String word) {
        return word.toLowerCase().charAt(0) % 26;
    }

    @Override
    public String toString() {
        return table.toString();
    }
}
