package br.com.javaoo.designpatterns.strategy.investimento;

/**
 * Created by david on 19/12/16.
 */
class Conservador implements Investimento{
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
}
