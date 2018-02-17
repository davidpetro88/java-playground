package com.example.generics.ex2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Accountant accountant = new Accountant();

        ArrayList<Object> employeesObject = new ArrayList<>();
        ArrayList<Accountant> accountants = new ArrayList<>();
//        employeesObject = accountants -- error complie

        // wildcard ?
        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<>();
        ArrayList<String> accountantsString2 = new ArrayList<>();
        employees2 = accountants2;
        employees2 =  accountantsString2;

//        upper bound
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<>();
        ArrayList<String> accountantsString3 = new ArrayList<>();
        employees3 = accountants3;
//        employees3 = accountantsString3; -- error not compile


//        lower bound
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Accountant> accountants4 = new ArrayList<>();
        ArrayList<String> accountantsString4 = new ArrayList<>();
        ArrayList<Employee> employeesLowerBound = new ArrayList<>();
        employees4 = employeesLowerBound;
//        employees4 = accountants4; -- error not compile lower bound
//        employees4 = accountantsString4; -- error not compile


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        makeEmployeeWork(employees);

        ArrayList<Accountant> accountantList = new ArrayList<>();
        accountantList.add(new Accountant());
        makeEmployeeWork(accountantList);
    }

    private static void makeEmployeeWork(List<? extends Employee> employeeList) {
        for(Employee employee: employeeList){
            employee.work();
        }
    }
}
