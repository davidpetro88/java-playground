package br.com.javaoo.designpatterns.state.orcamento;

/**
 * Created by david on 22/12/16.
 */
class TestesDoDescontoExtra {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500.0);

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); // imprime 475,00 pois descontou 5%
        reforma.aprova(); // aprova nota!

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); // imprime 465,50 pois descontou 2%

        reforma.finaliza();

        // reforma.aplicaDescontoExtra(); lancaria excecao, pois não pode dar desconto nesse estado
        // reforma.aprova(); lança exceção, pois não pode ir para aprovado
    }
}
