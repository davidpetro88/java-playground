package com.example.lambda.stream.flatmap.ex2;

import com.example.lambda.stream.flatmap.Department;
import com.example.lambda.stream.flatmap.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

  public static void main(String[] args) {
    Employee john = new Employee("John Doe", 30);
    Employee edTom = new Employee("ed Tom", 30);
    Employee milner = new Employee("Milner Tim", 30);
    Employee jane = new Employee("Jane Deer", 25);
    Employee mario = new Employee("Mario K", 25);
    Employee jack = new Employee("Jack Hill", 40);
    Employee joshep = new Employee("Joshep K.", 40);
    Employee snow = new Employee("Snow White", 19);
    Employee kane = new Employee("Kane Scot", 22);
    Employee brianThomas = new Employee("Brian Thomas", 22);
    Employee willHarper = new Employee("Will Harper", 22);

    Department hr = new Department("Human Resources");
    hr.addEmployee(jane);
    hr.addEmployee(edTom);
    hr.addEmployee(willHarper);
    hr.addEmployee(jack);
    hr.addEmployee(kane);
    hr.addEmployee(joshep);
    hr.addEmployee(snow);
    Department accounting = new Department("Accounting");
    accounting.addEmployee(john);
    accounting.addEmployee(milner);
    accounting.addEmployee(mario);
    accounting.addEmployee(brianThomas);

    List<Department> departments = new ArrayList<>();
    departments.add(hr);
    departments.add(accounting);

    System.out.println("\n All Employee.");
    departments.stream()
      .flatMap(department -> department.getEmployees().stream())
      .forEach(System.out::println);

    Map<Integer, List<Employee>> groupedByAge = departments.stream()
      .flatMap(department -> department.getEmployees().stream())
      .collect(Collectors.groupingBy(employee -> employee.getAge()));

    System.out.println("\n Group By Age.");
    groupedByAge.forEach( (k, v) -> {
      System.out.println("Age : "  + k);
      v.forEach( name -> System.out.println("name: " + name));
    });

    System.out.println("\n Get Minimun age.");
    departments.stream()
      .flatMap(department -> department.getEmployees().stream())
      .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
      .ifPresent(System.out::println);
  }
}