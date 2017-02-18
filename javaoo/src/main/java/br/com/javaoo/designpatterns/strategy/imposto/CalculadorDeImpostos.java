package br.com.javaoo.designpatterns.strategy.imposto;


/**
 * Created by david on 19/12/16.
 */
public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

        double valor = imposto.calcula(orcamento);

        System.out.println(valor);

    }

}