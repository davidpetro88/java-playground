package com.data.structure.queue.ex1;


import java.util.LinkedList;
import java.util.List;

public class Queue {

    private List<String> studentList = new LinkedList<>();

    public void add(String student) {
        studentList.add(student);
    }

    public String remove() {
        return studentList.remove(0);
    }

    public boolean isEmpty() {
        return studentList.isEmpty();
    }

    @Override
    public String toString() {
        return studentList.toString();
    }
}
