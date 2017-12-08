package com.singleton.ex2;

/**
 * Created by david on 11/04/17.
 */
public enum SingletonClass {
        INSTANCE;
    private int counter;

    public void setCounter(int counter){
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}
