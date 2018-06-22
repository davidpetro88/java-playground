package com.data.structure.stack.ex1;

import java.util.LinkedList;
import java.util.List;

public class Stack {

    private List<String> nameList = new LinkedList<>();

    public void push(String name){
        nameList.add(name);
    }

    public String pop(){
        return nameList.remove(nameList.size()-1);
    }

    public boolean isEmpty(){
        return nameList.isEmpty();
    }

    @Override
    public String toString() {
        return nameList.toString();
    }
}
