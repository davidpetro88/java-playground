package br.com.javaoo.designpatterns.decorator.imposto;

/**
 * Created by david on 20/12/16.
 */
public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateDeImpostoCondicional() {}

    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
        } else {
            return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract double minimaTaxacao(Orcamento orcamento);
}