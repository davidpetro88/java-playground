package com.example.reflection.contructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
    InvocationTargetException, InstantiationException {
    Class<?> subControllerClass3 = Class.forName("com.example.reflection.SubController");

    printAllMethod(subControllerClass3);
    System.out.println("");
    printAllMethodOnlyOfClass(subControllerClass3);

    Object subController = subControllerClass3.getDeclaredConstructor().newInstance();

    System.out.println();
    System.out.println(subControllerClass3.getDeclaredMethod("getHelloPublic").invoke(subController));

    Method methodPrivateSubController = subControllerClass3.getDeclaredMethod("getHelloPrivate");
    methodPrivateSubController.setAccessible(Boolean.TRUE);
    System.out.println(methodPrivateSubController.invoke(subController));

    System.out.println(subControllerClass3.getDeclaredMethod("getVoid").invoke(subController));

    System.out.println(subControllerClass3.getDeclaredMethod("plus", Integer.class,  Integer.class)
      .invoke(subController, 2, 3));

  }

  private static void printAllMethodOnlyOfClass(Class<?> classVal) {
    for (Method m : classVal.getDeclaredMethods()) {
      System.out.println(m);
    }
  }

  private static void printAllMethod(Class<?> classVal) {
    for (Method m : classVal.getMethods()) {
      System.out.println(m);
    }
  }
}
