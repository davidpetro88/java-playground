package com.command.ex2;

/**
 * Created by david on 09/04/17.
 */
public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void solvedProblem(){
        System.out.println("Solving the problem with ID " + this.id);
    }
}
