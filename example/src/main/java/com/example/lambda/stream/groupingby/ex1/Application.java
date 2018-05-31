package com.example.lambda.stream.groupingby.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Application {

  public static void main(String[] args) {

    Category one = new Category(1, "One");
    one.setProduct(Arrays.asList(new Product(1, "Car"),
      new Product(2, "Bike")));

    Category one1 = new Category(1, "One");
    one1.setProduct(Arrays.asList(new Product(3, "Mobile"),
      new Product(4, "Toy")));

    Category one2 = new Category(2, "One");
    one2.setProduct(Arrays.asList(new Product(5, "Notebook"),
      new Product(6, "Short")));

    Category two = new Category(2, "Two");
    two.setProduct(Arrays.asList(new Product(7, "PlayStation"),
      new Product(8, "X-box")));
    Category two2 = new Category(1, "Two");
    two2.setProduct(Arrays.asList(new Product(9, "Bag"),
      new Product(10, "watch")));

    List<Category> categories = Arrays.asList(one, one1, one2, two, two2);

    Map<Integer, List<Category>> collectMap = categories.stream().collect(groupingBy(Category::getCategory));
    collectMap.forEach((k, v) -> {
      System.out.println("Key: " + k);
      v.forEach(product -> {
        product.getProduct().forEach(p -> {
          System.out.println("Product :" + p.getName());
        });
      });
    });


  }
}
