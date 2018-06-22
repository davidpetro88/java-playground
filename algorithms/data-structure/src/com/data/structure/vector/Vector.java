package com.data.structure.vector;

import java.util.Arrays;

public class Vector {

    private Student[] student = new Student[100];
    private int totalStudent = 0;

    public void add(Student newStudent){
        ensureSpace();
        this.student[totalStudent] = newStudent;
        totalStudent++;
    }

    public void add(int position, Student newStudent){
        ensureSpace();
        if(!positionIsValid(position)) throw new IllegalArgumentException("Position Invalid");
        for(int i = totalStudent -1; i >= position; i -=1){
            student[i+1] = student[i];
        }
        student[position] = newStudent;
        totalStudent++;
    }

    public void add2(Student newStudent){
        for (int i = 0; i < student.length; i++ ) {
            if (student[i] == null) {
                student[i] = newStudent;
                break;
            }
        }
    }

    public Student get(int position) {
        if(!hasPositiion(position)) {
            throw new IllegalArgumentException("Invalid Position");
        }
        return student[position];
    }

    public void remove(int position) {
        for (int i = position;  i < totalStudent; i++ ){
            student[i] = student[i+1];
        }
        totalStudent--;
        student[totalStudent] = null;
    }

    public boolean contain(Student searchStudent) {
        for( int i =0; i < totalStudent; i++){
            if(searchStudent.equals(student[i])) return true;
        }
        return false;
    }

    public int size() {
        return totalStudent;
    }

    @Override
    public String toString() {
        return Arrays.toString(student);
    }

    private boolean positionIsValid(int position){
        return position >= 0 && position <= totalStudent;
    }

    private boolean hasPositiion(int position){
        return position >= 0 && position < totalStudent;
    }

    private void ensureSpace(){
        if (totalStudent == student.length){
            Student[] studentNewArray = new Student[student.length*2];
            for (int i = 0; i < student.length; i++){
                studentNewArray[i] = student[i];
            }
            this.student = studentNewArray;
        }
    }
}
