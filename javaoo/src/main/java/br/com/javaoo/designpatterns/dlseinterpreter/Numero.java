package br.com.javaoo.designpatterns.dlseinterpreter;

/**
 * Created by david on 25/12/16.
 */
public class Numero implements Expressao {

    private int numero;
    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return numero;
    }
}
