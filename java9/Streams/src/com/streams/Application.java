package com.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
        List<Product> productsSearch = List.of(
                new Product(1, "Car", Category.TOY, Company.TOY_1),
                new Product(2, "PlayStation", Category.ELECTRONIC, Company.ELECTRONIC_1),
                new Product(3, "Boot", Category.CLOTHING, Company.CLOTHING_2),
                new Product(6, "RADIO", Category.ELECTRONIC, Company.ELECTRONIC_1)
        );

        System.out.println("Similar products Map ---------------------------------------------------------------------");
        productsSearch.stream()
                .map(ProductService::findSimilar)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n Similar products Map and Filter---------------------------------------------------------");
        productsSearch.stream()
                .map(ProductService::findSimilar)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n Similar products Map and FlatMap --------------------------------------------------------");
        productsSearch.stream()
                .map(ProductService::findSimilar)
                .flatMap(Optional::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n Similar products FlatMap ---------------------------------------------------------------");
        productsSearch.stream()
                .flatMap(b -> ProductService.findSimilar(b).stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\n Similar products chaining or -----------------------------------------------------------");
        Product product = new Product(6, "NOT_EXIST", Category.NOT_EXIST, Company.ELECTRONIC_1);
        ProductService.findSimilar(product)
                .or(() -> ProductService.findSimilar(product)) // 2
                .or(() -> ProductService.findSimilar(product))
                .ifPresentOrElse( System.out::println,
                        () -> System.out.println("There are no similar to your search :" + product));

    }
}
