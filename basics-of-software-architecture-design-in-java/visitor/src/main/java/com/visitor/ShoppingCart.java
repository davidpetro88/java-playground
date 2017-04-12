package com.visitor;

/**
 * Created by david on 11/04/17.
 */
public class ShoppingCart implements ShoppingCartVisitor {
    public double visit(Table table) {
        return table.getPrice();
    }

    public double visit(Chair chair) {
        return chair.getPrice();
    }
}
