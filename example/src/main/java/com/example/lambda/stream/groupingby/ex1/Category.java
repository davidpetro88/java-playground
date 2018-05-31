package com.example.lambda.stream.groupingby.ex1;

import java.util.List;

public class Category {
  private Integer category;
  private String name;
  private List<Product> product;

  public Category(Integer category, String name) {
    this.category = category;
    this.name = name;
  }

  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Product> getProduct() {
    return product;
  }

  public void setProduct(List<Product> product) {
    this.product = product;
  }
}
