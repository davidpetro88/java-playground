package br.com.javaoo.designpatterns.visitor;

/**
 * Created by david on 25/12/16.
 */
public class Multiplicacao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda * resultadoDaDireita;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaMultiplicacao(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Expressao esquerda) {
        this.esquerda = esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }

    public void setDireita(Expressao direita) {
        this.direita = direita;
    }
}
