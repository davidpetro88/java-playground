package br.com.javaoo.designpatterns.state.conta;

/**
 * Created by david on 22/12/16.
 */
public class TesteContaBancaria {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100.00);
        System.out.println(conta.getSaldo());
        conta.saca(20.00);
        System.out.println(conta.getSaldo());
    }
}
