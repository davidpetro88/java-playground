package br.com.javaoo.designpatterns.dlseinterpreter;

/**
 * Created by david on 25/12/16.
 */
public class Programa {

    public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao conta = new Soma(esquerda, direita);
        Expressao multiplicacao = new Multiplicacao(esquerda, direita);
        Expressao divisao = new Divisao(esquerda, direita);
        Expressao raizquadrada = new RaizQuadrada(new Numero(16));


        int resultado = conta.avalia();
        System.out.println(resultado);
        System.out.println(multiplicacao.avalia());
        System.out.println(divisao.avalia());
        System.out.println(raizquadrada.avalia());
    }
}