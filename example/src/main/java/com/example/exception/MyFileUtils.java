package com.example.exception;

public class MyFileUtils {

    public int subtract10FromLargerNumber(int number) throws MyFileUtilsException {
        if(number < 10) throw  new MyFileUtilsException("Number smaller than 10");
        return number-10;
    }
}
