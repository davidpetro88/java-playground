package br.com.javaoo.designpatterns.decorator.imposto;


/**
 * Created by david on 19/12/16.
 */
public class ICMS extends Imposto {

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    public ICMS() {
        super();
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
    }
}
