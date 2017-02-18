package br.com.javaoo.designpatterns.templatemethod.imposto;

/**
 * Created by david on 20/12/16.
 */
public abstract class TemplateDeImpostoCondicional implements Imposto {

    public double calcula(Orcamento orcamento) {

        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
    protected abstract double maximaTaxacao(Orcamento orcamento);
    protected abstract double minimaTaxacao(Orcamento orcamento);
}