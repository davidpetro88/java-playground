package br.com.javaoo.designpatterns.strategy.imposto;

/**
 * Created by david on 19/12/16.
 */
public class ISS implements Imposto {

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
