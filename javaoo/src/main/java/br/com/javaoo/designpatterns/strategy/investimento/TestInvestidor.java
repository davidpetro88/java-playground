package br.com.javaoo.designpatterns.strategy.investimento;

/**
 * Created by david on 24/12/16.
 */
public class TestInvestidor {

    public static void main(String[] args) {
        Investimento arrojado = new Arrojado();
        Investimento conservador = new Conservador();
        Investimento moderado = new Moderado();

        Conta conta = new Conta();
        conta.deposita(600);

        RealizadorDeInvestimentos realizadorDeInvestimento = new RealizadorDeInvestimentos();
        realizadorDeInvestimento.realiza(conta,arrojado);
        realizadorDeInvestimento.realiza(conta,conservador);
        realizadorDeInvestimento.realiza(conta,moderado);
    }
}
