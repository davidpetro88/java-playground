package com.example.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Application {

  public static void main(String[] args) {
    Employee david = new Employee("David Petro", 30);
    Employee bart = new Employee("Bart Rodriges", 21);
    Employee tim = new Employee("Tim Hill", 40);
    Employee aline = new Employee("Aline Silva", 22);
    Employee bill = new Employee("Bill Ed", 40);

    List<Employee> employees = new ArrayList<>();
    employees.add(david);
    employees.add(bart);
    employees.add(tim);
    employees.add(aline);
    employees.add(bill);

    Function<Employee, String> getLastName = (Employee employee) -> {
      return employee.getName().substring(employee.getName().indexOf(' ') + 1);
    };

    System.out.println(" Print LastName indice 1.");
    System.out.println(getLastName.apply(employees.get(1)));


    System.out.println(" \n Get First Name.");
    Function<Employee, String> getFirstName = (Employee employee) -> employee.getName()
      .substring(0, employee.getName().indexOf(' '));
    System.out.println(getFirstName.apply(employees.get(1)));

    System.out.println(" \n Get Random First and LastName");
    Random random1 = new Random();
    for (Employee employee : employees) {
      if (random1.nextBoolean()) {
        System.out.println(getAName(getFirstName, employee));
      } else {
        System.out.println(getAName(getLastName, employee));
      }
    }
  }

  private static String getAName(Function<Employee, String> getName, Employee employee) {
    return getName.apply(employee);
  }
}

