package com.example.comparable.ex1;

public class Employer implements Comparable<Employer> {
  private String name;
  private int salary;
  private String department;

  public Employer(String name, int salary, String department) {
    this.name = name;
    this.salary = salary;
    this.department = department;
  }

  @Override
  public int compareTo(Employer o) {
    if (this.salary < o.salary) return -1;
    else if (this.salary > o.salary) return 1;
    return 0;
  }

  @Override
  public String toString() {
    return "Employer{" +
      "name='" + name + '\'' +
      ", salary=" + salary +
      ", department='" + department + '\'' +
      '}';
  }
}
