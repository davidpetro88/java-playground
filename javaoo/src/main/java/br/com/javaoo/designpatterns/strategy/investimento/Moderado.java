package br.com.javaoo.designpatterns.strategy.investimento;

import java.util.Random;

/**
 * Created by david on 19/12/16.
 */
class Moderado implements Investimento {
    private Random random;

    public Moderado() {
        this.random = new Random();
    }

    public double calcula(Conta conta) {
        if(random.nextInt(2) == 0) return conta.getSaldo() * 0.025;
        else return conta.getSaldo() * 0.007;
    }
}