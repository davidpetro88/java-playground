package br.com.javaoo.designpatterns.observer;

/**
 * Created by david on 23/12/16.
 */
public class ItemDaNota {
    private String descricao;
    private double valor;

    public ItemDaNota(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
