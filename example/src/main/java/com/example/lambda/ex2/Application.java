package com.example.lambda.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    ex1(employees);
    List<Employee> employeesEx2 = ex2(employees);


    String sillyString = doStringStuff(new UpperConcat() {
      @Override
      public String upperAndConcat(String s1, String s2) {
        return s1.toUpperCase() + " " + s2.toUpperCase();
      }
    },  employeesEx2.get(0).getName(), employeesEx2.get(1).getName());
    System.out.println(sillyString);

    UpperConcat uc = (s1, s2) -> s1.toUpperCase() + " " +  s2.toUpperCase();
    String sillyString2 = doStringStuff(uc, employeesEx2.get(0).getName(), employeesEx2.get(1).getName());
    System.out.println(sillyString2);


    System.out.println("\n another class");
    AnotherClass anotherClass = new AnotherClass();
    String s = anotherClass.doSomething();
    System.out.println(s);
  }

  private static void ex1(List<Employee> employees) {
    Collections.sort(employees, new Comparator<Employee>() {
      @Override
      public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
      }
    });
    for(Employee employee : employees) {
      System.out.println(employee.getName());
    }
  }

  private static List<Employee> ex2(List<Employee> employees) {
    Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));
    for(Employee employee : employees) {
      System.out.println(employee.getName());
    }
    return employees;
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
  public String upperAndConcat(String s1, String s2);
}

class AnotherClass {

  public String doSomething() {
    UpperConcat uc = (s1, s2) -> {
      System.out.println("The lambda expression's class is " + getClass().getSimpleName());
      return s1.toUpperCase() + " " + s2.toUpperCase();
    };

    System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
    return Application.doStringStuff(uc,"String1","String2");
  }
}
