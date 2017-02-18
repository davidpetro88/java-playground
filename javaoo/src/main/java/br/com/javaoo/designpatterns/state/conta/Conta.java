package br.com.javaoo.designpatterns.state.conta;

/**
 * Created by david on 22/12/16.
 */
public class Conta {
    protected double saldo;
    protected EstadoDaConta estado;

    public Conta(){
        estado = new Positivo();
    }

    public void saca(double valor) {
        estado.saca(this, valor);
    }

    public void deposita(double valor) {
        estado.deposita(this, valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}