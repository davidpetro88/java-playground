package br.com.javaoo.designpatterns.templatemethod.relatorio;

import java.util.List;

/**
 * Created by david on 21/12/16.
 */
class RelatorioSimples extends Relatorio {
    protected void cabecalho() {
        System.out.println("Banco XYZ");
    }

    protected void rodape() {
        System.out.println("(11) 1234-5678");
    }

    protected void corpo(List<Conta> contas) {
        for(Conta conta : contas) {
            System.out.println( conta.getNome() + " - " + conta.getSaldo() );
        }
    }
}
