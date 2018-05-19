package com.example.lambda.scope;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    Employee david = new Employee("David", 30);
    Employee bart = new Employee("Bart", 21);
    Employee tim = new Employee("Tim", 40);
    Employee aline = new Employee("Aline", 22);
    Employee bill = new Employee("Bill", 40);

    List<Employee> employees = new ArrayList<>();
    employees.add(david);
    employees.add(bart);
    employees.add(tim);
    employees.add(aline);
    employees.add(bill);

    System.out.println("\n Print Employe");
    employees.forEach(employee -> {
      System.out.println(employee.getName());
      System.out.println(employee.getAge());
    });

    System.out.println("\n Print Employe With Thread");
    employees.forEach(employee -> {
      System.out.println(employee.getName());
      new Thread(() -> System.out.println(employee.getAge())).start();
    });

    System.out.println("\n ******************");
    for (int i = 0; i < employees.size(); i++) {
      Employee employee = employees.get(i);
      System.out.println(employee.getName());
      new Thread(() -> System.out.println(employee.getAge())).start();
    }

    System.out.println("\n another class");
    AnotherClass anotherClass = new AnotherClass();
    String s = anotherClass.doSomething();
    System.out.println(s);
  }

  public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
    return uc.upperAndConcat(s1, s2);
  }
}

class Employee {
  private String name;
  private int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

interface UpperConcat {
  String upperAndConcat(String s1, String s2);
}

class AnotherClass {

  public String doSomething() {
    int i = 0;

    UpperConcat uc = (s1, s2) -> {
      System.out.println("The lambda expression's class is " + getClass().getSimpleName());
      System.out.println("i in the lambda expression = " + i);
      String result = s1.toUpperCase() + s2.toUpperCase();
      return result;
    };

    System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
    return Application.doStringStuff(uc, "String1", "String2");

  }

  public void printValue() {

    int number = 25;

    Runnable r = () -> {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("The value is " + number);
    };

    new Thread(r).start();
  }
}






