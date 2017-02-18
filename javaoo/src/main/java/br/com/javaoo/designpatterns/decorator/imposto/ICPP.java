package br.com.javaoo.designpatterns.decorator.imposto;

/**
 * Created by david on 20/12/16.
 */
public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP() {}
    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
