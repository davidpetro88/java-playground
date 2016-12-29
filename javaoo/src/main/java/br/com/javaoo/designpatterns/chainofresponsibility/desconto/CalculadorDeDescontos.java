package br.com.javaoo.designpatterns.chainofresponsibility.desconto;


/**
 * Created by david on 20/12/16.
 */
public class CalculadorDeDescontos {
    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorMaisDeCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();


        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        return d1.desconta(orcamento);
    }
}