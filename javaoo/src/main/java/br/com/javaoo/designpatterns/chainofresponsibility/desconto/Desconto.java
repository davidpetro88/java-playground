package br.com.javaoo.designpatterns.chainofresponsibility.desconto;

/**
 * Created by david on 20/12/16.
 */
public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
