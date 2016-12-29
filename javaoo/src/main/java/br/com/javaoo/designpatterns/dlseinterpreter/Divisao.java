package br.com.javaoo.designpatterns.dlseinterpreter;

/**
 * Created by david on 25/12/16.
 */
public class Divisao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda / resultadoDaDireita;
    }
}
