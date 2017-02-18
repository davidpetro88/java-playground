package br.com.javaoo.designpatterns.visitor;

/**
 * Created by david on 25/12/16.
 */
public interface Visitor {
    void visitaSoma(Soma soma);
    void visitaSubtracao(Subtracao subtracao);
    void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
    void visitaDivisao(Divisao divisao);
    void visitaMultiplicacao(Multiplicacao multiplicacao);

}
