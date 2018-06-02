package com.streams;

import java.util.List;
import java.util.Optional;

public class ProductService {

    public static Optional<Product> findSimilar(Product product) {
        return all().stream()
                .filter(b -> b.getCategory().equals(product.getCategory()))
                .filter(b -> !b.getCompany().equals(product.getCompany()))
                .findAny();
    }

    private static List<Product> all() {
        return List.of(
                new Product(1, "Toy", Category.TOY, Company.TOY_1),
                new Product(2, "Doll", Category.TOY, Company.TOY_2),
                new Product(3, "Computer", Category.ELECTRONIC, Company.ELECTRONIC_1),
                new Product(4, "Notebook", Category.ELECTRONIC, Company.ELECTRONIC_1),
                new Product(5, "TV", Category.ELECTRONIC, Company.ELECTRONIC_2),
                new Product(6, "RADIO", Category.ELECTRONIC, Company.ELECTRONIC_1),
                new Product(7, "shirt", Category.CLOTHING, Company.CLOTHING_1),
                new Product(8, "shorts", Category.CLOTHING, Company.CLOTHING_2)
        );
    }


}
