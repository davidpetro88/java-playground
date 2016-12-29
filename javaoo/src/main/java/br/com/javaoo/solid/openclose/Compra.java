package br.com.javaoo.solid.openclose;

/**
 * Created by david on 28/12/16.
 */
public class Compra {
    private double valor;
    private String cidade;

    public Compra(double valor, String cidade) {
        this.valor = valor;
        this.cidade = cidade;
    }

    public double getValor() {
        return valor;
    }

    public String getCidade() {
        return cidade;
    }
}
