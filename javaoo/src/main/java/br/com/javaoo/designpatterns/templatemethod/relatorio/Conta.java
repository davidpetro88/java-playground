package br.com.javaoo.designpatterns.templatemethod.relatorio;

/**
 * Created by david on 21/12/16.
 */
public class Conta {
    private String agencia;
    private long numero;
    private double saldo;
    private String nome;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
