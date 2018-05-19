package com.example.lambda.predicate.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
    printEmployeesByAge(employees, "\nEmployees 30 and under", employee -> employee.getAge() <= 30);
    printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
      @Override
      public boolean test(Employee employee) {
        return employee.getAge() < 25;
      }
    });

    IntPredicate greaterThan15 = i -> i > 15;
    IntPredicate lessThan100 = i -> i < 100;
    LongPredicate lessThan100Long = i -> i  < 100l;

    System.out.println(greaterThan15.test(10));
    System.out.println(lessThan100Long.test(15L));
    int a = 20;
    System.out.println(greaterThan15.test(a + 5));

    System.out.println(greaterThan15.and(lessThan100).test(50));
    System.out.println(greaterThan15.and(lessThan100).test(15));
  }

  private static void printEmployeesByAge(List<Employee> employees,
                                          String ageText,
                                          Predicate<Employee> ageCondition) {

    System.out.println(ageText);
    System.out.println("==================");
    for (Employee employee : employees) {
      if (ageCondition.test(employee)) {
        System.out.println(employee.getName());
      }
    }
  }
}
