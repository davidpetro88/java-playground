package br.com.javaoo.designpatterns.observer;

/**
 * Created by david on 23/12/16.
 */
public class ItemDaNotaBuilder {
    private String descricao;
    private double valor;
    public ItemDaNotaBuilder comDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ItemDaNotaBuilder comValor(double valor) {
        this.valor = valor;
        return this;
    }

    public ItemDaNota constroi() {
        return new ItemDaNota(descricao, valor);
    }
}
