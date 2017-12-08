package com.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 11/04/17.
 */
public class App {

    /**
     * Visitor pattern -> way of separating an algorithm from an object structure on which it operates
     * <p>
     * A practical result of this separation is the ability to add
     * new operations to existing object structures without modifying those structures
     * - we can solve the open-closed principle with this design pattern as well !!!
     * <p>
     * IMPORTANT: We can extract common operations into a unique class
     * For example: webshop application
     */
    public static void main(String[] args) {

        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table("table", 22));
        items.add(new Table("table", 3));
        items.add(new Table("table", 2));
        items.add(new Chair("chair", 45));

        double sum = 0;
        ShoppingCartVisitor shoppingCart = new ShoppingCart();

        for (ShoppingItem shoppingItem : items)
            sum = sum + shoppingItem.accept(shoppingCart);

        System.out.println(sum);
    }
}
