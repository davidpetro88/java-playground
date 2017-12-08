package com.visitor;

/**
 * Created by david on 11/04/17.
 */
public interface ShoppingCartVisitor {
    double visit(Table table);
    double visit(Chair chair);
}
