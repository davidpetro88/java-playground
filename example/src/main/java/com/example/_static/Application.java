package com.example._static;

public class Application {

  public static void main(String[] args) {
    SomeClass one = new SomeClass("one");
    SomeClass two = new SomeClass("two");
    SomeClass three = new SomeClass("three");
    System.out.println(one.getInstanceNumber());
    System.out.println(two.getInstanceNumber());
    System.out.println(three.getInstanceNumber());

    System.out.println();
    System.out.println();
    System.out.println();

    int pw = 674312;
    Password password = new ExtendedPassword(pw);
    password.storePassword();
    password.letMeIn(1);
    password.letMeIn(674312);

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("Application method called");
    SIBTest test = new SIBTest();
    test.someMethod();
    System.out.println("Owner is " + SIBTest.owner);
  }
}
