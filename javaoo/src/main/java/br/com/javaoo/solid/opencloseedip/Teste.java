package br.com.javaoo.solid.opencloseedip;

/**
 * Created by david on 28/12/16.
 */
public class Teste {

    public static void main(String[] args) {
        TabelaDePreco tabelaDePreco = new TabelaDePrecoPadrao();
        ServicoDeEntrega servicoDeEntrega = new Frete();
        CalculadoraDePrecos calculadoraDePrecos = new CalculadoraDePrecos(tabelaDePreco, servicoDeEntrega);
        calculadoraDePrecos.calcula(new Compra(10.00, "TESTE"));
    }
}
