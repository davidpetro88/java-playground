package br.com.javaoo.designpatterns.chainofresponsibility.desconto;

/**
 * Created by david on 20/12/16.
 */
public class DescontoPorMaisDeCincoItens implements Desconto {
    private Desconto proximo;

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    public double desconta(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.10;
        }
        else {
            return proximo.desconta(orcamento);
        }
    }
}
