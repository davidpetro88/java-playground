package br.com.javaoo.designpatterns.decorator.imposto;


/**
 * Created by david on 19/12/16.
 */
public class ICCC extends Imposto {


    public ICCC(Imposto imposto) {
        super(imposto);
    }

    public ICCC() {
        super();
    }

    public double calcula(Orcamento orcamento) {
        if(orcamento.getValor() < 1000) {
            return orcamento.getValor() * 0.05;
        }
        else if (orcamento.getValor() <= 3000) {
            return orcamento.getValor() * 0.07;
        }
        else {
            return orcamento.getValor() * 0.08 + 30;
        }
    }
}
