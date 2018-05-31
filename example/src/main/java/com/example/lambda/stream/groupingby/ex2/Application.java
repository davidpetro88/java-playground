package com.example.lambda.stream.groupingby.ex2;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Application {

  public static void main(String[] args) {

    Category categoryOne = new Category(1, "first");
    Category categoryTwo = new Category(2, "second");

    List<Product> productList = Arrays.asList(new Product(1, "Car", categoryOne),
      new Product(2, "Bike", categoryOne),
      new Product(3, "Mobile", categoryOne),
      new Product(4, "Toy", categoryOne),
      new Product(5, "Notebook", categoryTwo),
      new Product(6, "Short", categoryOne),
      new Product(7, "PlayStation", categoryOne),
      new Product(8, "X-box", categoryTwo),
      new Product(9, "bag", categoryTwo),
      new Product(10, "watch", categoryOne));

    Map<Integer, List<Product>> collectMap = productList.stream().collect(groupingBy(p -> p.getCategory().getId()));

    collectMap.forEach((k, v) -> {
      System.out.println("Key: " + k);
      v.forEach(product -> {
        System.out.println("Product :" + product.getName());
      });
    });
  }
}
