package br.com.javaoo.designpatterns.visitor;

/**
 * Created by david on 25/12/16.
 */
public class RaizQuadrada implements Expressao {
    private Expressao expressao;

    public RaizQuadrada(Expressao e) {
        this.expressao = e;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(expressao.avalia());
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaRaizQuadrada(this);
    }
}