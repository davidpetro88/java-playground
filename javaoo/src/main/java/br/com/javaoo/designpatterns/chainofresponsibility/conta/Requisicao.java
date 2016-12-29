package br.com.javaoo.designpatterns.chainofresponsibility.conta;

/**
 * Created by david on 20/12/16.
 */
class Requisicao {
    private Formato formato;
    public Requisicao(Formato formato) {
        this.formato = formato;
    }

    public Formato getFormato() {
        return formato;
    }
}