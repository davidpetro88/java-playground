package br.com.javaoo.designpatterns.strategy.imposto;

/**
 * Created by david on 20/12/16.
 */
public class Item {

    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

}