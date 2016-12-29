package br.com.javaoo.designpatterns.decorator.imposto;


/**
 * Created by david on 21/12/16.
 */
public class ISS extends Imposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ISS() {
        super();
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
    }
}
