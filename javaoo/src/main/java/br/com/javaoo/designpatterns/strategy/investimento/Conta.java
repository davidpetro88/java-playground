package br.com.javaoo.designpatterns.strategy.investimento;

/**
 * Created by david on 19/12/16.
 */
class Conta {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}