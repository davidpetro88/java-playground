package br.com.javaoo.designpatterns.templatemethod.relatorio;

import java.util.List;

/**
 * Created by david on 21/12/16.
 */
abstract class Relatorio {
    protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public void imprime(List<Conta> contas) {
        cabecalho();
        corpo(contas);
        rodape();
    }
}