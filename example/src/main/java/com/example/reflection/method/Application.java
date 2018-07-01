package com.example.reflection.method;

import java.util.HashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) throws Exception {

    Map<String, Object> mapParams = new HashMap<>();
    mapParams.put("arg0", "arg0");
    mapParams.put("arg1", "arg1");
    System.out.println(new GenericClass("com.example.reflection.ex4.MyClass")
      .callMethod("myMethod", mapParams));

    System.out.println(new GenericClass("com.example.reflection.ex4.MyClass")
      .callMethod("myMethod"));

  }
}
