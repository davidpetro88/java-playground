package br.com.javaoo.designpatterns.strategy.imposto;

/**
 * Created by david on 19/12/16.
 */
public class ICMS implements Imposto {
    private double valorFixo = new Double(50.0);


    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.5 + valorFixo;
    }
}
