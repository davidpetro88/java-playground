package com.example.exception;

public class Application {

  public static void main(String[] args) {
    MyFileUtils myFileUtils = new MyFileUtils();
    try {
      System.out.println("Result : " + myFileUtils.subtract10FromLargerNumber(10));
      System.out.println("Result : " + myFileUtils.subtract10FromLargerNumber(5));
    } catch (MyFileUtilsException e) {
      e.printStackTrace();
    }
  }
}
