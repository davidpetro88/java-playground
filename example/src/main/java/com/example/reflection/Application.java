package com.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Application {

  public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException,
    NoSuchMethodException {
    Class<Controller> controllerClass = Controller.class;
    System.out.println(controllerClass.newInstance() instanceof Controller);

    Controller controller = new Controller();
    Class<? extends Controller> controllerClass2 = controller.getClass();
    System.out.println(controllerClass2.newInstance() instanceof Controller);

    Class<?> controllerClass3 = Class.forName("com.example.reflection.Controller");
    System.out.println(controllerClass3.newInstance() instanceof Controller);

    Constructor<Controller> publicConstructor = controllerClass.getConstructor();
    System.out.println(publicConstructor);

    Constructor<Controller> privateConstructor = controllerClass.getDeclaredConstructor(String.class);
    System.out.println(privateConstructor);

    try {
      Object controllerPublic = publicConstructor.newInstance();
      System.out.println(controllerPublic);

      privateConstructor.setAccessible(Boolean.TRUE);
      Object controllerPrivate = privateConstructor.newInstance(("value from constructor!!!"));
      System.out.println(controllerPrivate);
      System.out.println(((Controller) controllerPrivate).getValue());

    } catch (InvocationTargetException ex) {
      ex.printStackTrace();
    }

  }
}
