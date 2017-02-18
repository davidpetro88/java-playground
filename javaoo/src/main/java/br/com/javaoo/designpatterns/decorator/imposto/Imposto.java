package br.com.javaoo.designpatterns.decorator.imposto;


/**
 * Created by david on 21/12/16.
 */
public abstract class Imposto {

    protected Imposto outroImposto;
    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {}

    public abstract double calcula(Orcamento orcamento);

    protected double calculaOutroImposto(Orcamento orcamento) {
        if(outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }
}
