package br.com.javaoo.designpatterns.decorator.imposto;

/**
 * Created by david on 21/12/16.
 */
public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto imposto) {
        super(imposto);
    }

    public ImpostoMuitoAlto() {
        super();
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
    }

}
