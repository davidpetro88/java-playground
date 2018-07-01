package com.example.reflection.method;

public class MyClass {

  public MyClass(){}

  public String myMethod(){
    return "request without argument";
  }

  public String myMethod(String arg0, String arg1){
    return "request with 2 arguments -> arg1 : "+ arg0 + " arg2 : " + arg1;
  }

  public String goodMorning(String arg0){
    return "Good morning "+ arg0 + " how are you ?" ;
  }
}
