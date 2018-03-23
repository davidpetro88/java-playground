package com.example.autoclose;

public class Application {

  public static void main(String[] args) {

    try (MyCustoAutoClose myCustoAutoClose = new MyCustoAutoClose();) {
      System.out.println(myCustoAutoClose.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
