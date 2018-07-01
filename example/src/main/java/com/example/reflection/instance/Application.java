package com.example.reflection.instance;

import java.lang.reflect.InvocationTargetException;

public class Application {

  public static void main(String[] args) throws ClassNotFoundException {

    Class<?> classException = Class.forName("com.example.reflection.ClassException");

    //Best solution
    try {
      Object instanceClassExceptionByConstructor = classException.getDeclaredConstructor().newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }


    //he should require try catch, for this the example above is better classException.getDeclaredConstructor().newInstance()
    try {
      Object instanceClassException = classException.newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
