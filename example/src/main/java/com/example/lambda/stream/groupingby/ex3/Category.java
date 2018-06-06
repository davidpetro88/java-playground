package com.example.lambda.stream.groupingby.ex3;

import java.util.Objects;

public class Category {
  private Integer id;
  private String name;

  public Category(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Category)) return false;
    Category category = (Category) o;
    return Objects.equals(getId(), category.getId()) &&
      Objects.equals(getName(), category.getName());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getId(), getName());
  }
}
