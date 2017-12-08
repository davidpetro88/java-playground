package com.strategy;

/**
 * Created by david on 09/04/17.
 */
public class Add implements Strategy {
    @Override
    public void operation(int num1, int num2) {
        System.out.println(num1+num2);
    }
}
