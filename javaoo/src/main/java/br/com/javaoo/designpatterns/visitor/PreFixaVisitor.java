package br.com.javaoo.designpatterns.visitor;

/**
 * Created by david on 25/12/16.
 */
public class PreFixaVisitor implements Visitor {

    public void visitaSoma(Soma soma) {
        System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        soma.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaSubtracao(Subtracao subtracao) {
        System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {

    }

    @Override
    public void visitaDivisao(Divisao divisao) {
        System.out.print(" / ");
        System.out.print("(");
        divisao.getEsquerda().aceita(this);
        divisao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void visitaMultiplicacao(Multiplicacao multiplicacao) {
        System.out.print(" * ");
        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");
    }

    public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());

    }
}
