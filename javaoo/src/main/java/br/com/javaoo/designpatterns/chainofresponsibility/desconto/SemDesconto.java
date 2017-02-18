package br.com.javaoo.designpatterns.chainofresponsibility.desconto;

/**
 * Created by david on 20/12/16.
 */
public class SemDesconto implements Desconto {

    public double desconta(Orcamento orcamento) {
        return 0;
    }

    public void setProximo(Desconto desconto) {
        // nao tem!
    }
}
