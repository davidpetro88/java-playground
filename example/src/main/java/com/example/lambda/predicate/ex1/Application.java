package com.example.lambda.predicate.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee ->employee.getAge() <= 30);

    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println("==================");
        for(Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
