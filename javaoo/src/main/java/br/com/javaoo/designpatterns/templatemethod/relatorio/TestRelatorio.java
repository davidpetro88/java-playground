package br.com.javaoo.designpatterns.templatemethod.relatorio;

import java.util.ArrayList;

/**
 * Created by david on 24/12/16.
 */
public class TestRelatorio {

    public static void main(String[] args) {
        ArrayList<Conta> listConta = getListConta();

        RelatorioComplexo relatorioComplexo = new RelatorioComplexo();
        relatorioComplexo.imprime(listConta);

        RelatorioSimples relatorioSimples = new RelatorioSimples();
        relatorioSimples.imprime(listConta);
    }

    private static ArrayList<Conta> getListConta() {
        Conta conta1 = new Conta();
        conta1.setAgencia("1874-635");
        conta1.setNome("User Test Conta 1");
        conta1.setNumero(2796459839L);
        conta1.setSaldo(345.00);

        Conta conta2 = new Conta();
        conta2.setAgencia("1874-789");
        conta2.setNome("User Test Conta 2");
        conta2.setNumero(2989349839L);
        conta2.setSaldo(200);

        ArrayList<Conta> listConta = new ArrayList<Conta>();
        listConta.add(conta1);
        listConta.add(conta2);
        return listConta;
    }
}