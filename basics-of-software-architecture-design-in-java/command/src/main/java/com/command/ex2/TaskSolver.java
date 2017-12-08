package com.command.ex2;

/**
 * Created by david on 09/04/17.
 */
public class TaskSolver implements Command {

    private Task task;

    public TaskSolver(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        this.task.solvedProblem();
    }
}
