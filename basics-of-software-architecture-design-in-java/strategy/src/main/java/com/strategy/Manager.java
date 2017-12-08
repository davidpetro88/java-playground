package com.strategy;

/**
 * Created by david on 09/04/17.
 */
public class Manager implements Strategy{
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operation(int num1, int num2) {
        this.strategy.operation(num1,num2);
    }
}
