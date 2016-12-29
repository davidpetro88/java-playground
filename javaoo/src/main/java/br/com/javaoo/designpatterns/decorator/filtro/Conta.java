package br.com.javaoo.designpatterns.decorator.filtro;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by david on 20/12/16.
 */
public class Conta {
    private String titular;
    private double valor;
    private Calendar dataAbertura;

    public Conta(){}

    public Conta(String titular, double valor, Calendar dataAbertura) {
        this.titular = titular;
        this.valor = valor;
        this.dataAbertura = dataAbertura;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
