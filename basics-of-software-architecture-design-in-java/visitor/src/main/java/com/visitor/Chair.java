package com.visitor;

/**
 * Created by david on 11/04/17.
 */
public class Chair implements ShoppingItem {

    private String type;
    private double price;

    public Chair(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
    public double getPrice() {
        return price;
    }
}
