package br.com.javaoo.designpatterns.state.orcamento;

/**
 * Created by david on 22/12/16.
 */
public class Reprovado implements EstadoDeUmOrcamento {
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos Reprovados não recebem desconto extra!");
    }

    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos Reprovados não podem ser aprovado!");
    }

    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos reprovados não podem ser reprovado!");
    }

    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}
