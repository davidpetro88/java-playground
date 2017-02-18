package br.com.javaoo.designpatterns.visitor;

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

        Impressora impressora = new Impressora();
        System.out.println(conta.avalia());
        conta.aceita(impressora);

        System.out.println(multiplicacao.avalia());
        multiplicacao.aceita(impressora);

        System.out.println(divisao.avalia());
        divisao.aceita(impressora);

        System.out.println(raizquadrada.avalia());
        raizquadrada.aceita(impressora);
    }
}