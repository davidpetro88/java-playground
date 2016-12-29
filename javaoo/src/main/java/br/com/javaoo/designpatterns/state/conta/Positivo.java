package br.com.javaoo.designpatterns.state.conta;

/**
 * Created by david on 22/12/16.
 */
class Positivo implements EstadoDaConta {
    public void saca(Conta conta, double valor) {
        conta.saldo -= valor;
        if(conta.saldo < 0) conta.estado = new Negativo();
    }

    public void deposita(Conta conta, double valor) {
        conta.saldo += valor * 0.98;
    }

}
