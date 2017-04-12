package com.template;

/**
 * Created by david on 10/04/17.
 */
public abstract class Algorithm {
    abstract void initialize();
    abstract void sorting();
    abstract void printResult();

    void sort(){
        initialize();
        sorting();
        printResult();
    }

}
