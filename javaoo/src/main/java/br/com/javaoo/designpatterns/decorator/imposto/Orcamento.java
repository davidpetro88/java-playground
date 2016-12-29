package br.com.javaoo.designpatterns.decorator.imposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by david on 21/12/16.
 */
public class Orcamento {

    private double valor;
    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

}