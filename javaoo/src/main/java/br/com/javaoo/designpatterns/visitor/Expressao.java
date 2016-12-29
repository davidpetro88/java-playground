package br.com.javaoo.designpatterns.visitor;

/**
 * Created by david on 25/12/16.
 */
public interface Expressao {
    int avalia();
    void aceita(Visitor visitor);
}
