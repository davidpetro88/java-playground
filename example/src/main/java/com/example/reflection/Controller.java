package com.example.reflection;

public class Controller {

  private String value;

  public Controller(){}
  private Controller(String value){
    this.value = value;
  }

  public String message(String message){
    return message;
  }

  public String getValue() {
    return value;
  }
}
