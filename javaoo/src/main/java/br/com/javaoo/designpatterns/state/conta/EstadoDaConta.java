package br.com.javaoo.designpatterns.state.conta;

/**
 * Created by david on 22/12/16.
 */
interface EstadoDaConta {
    void saca(Conta conta, double valor);
    void deposita(Conta conta, double valor);
}