package com.data.structure.vector;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        Student student = (Student) o;
        return student.getName().equals(this.name);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
