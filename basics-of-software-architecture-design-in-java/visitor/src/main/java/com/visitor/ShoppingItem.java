package com.visitor;

/**
 * Created by david on 11/04/17.
 */
public interface ShoppingItem {
    double accept(ShoppingCartVisitor visitor);
}
