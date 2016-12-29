package br.com.javaoo.designpatterns.state.orcamento;

/**
 * Created by david on 22/12/16.
 */
class Aprovado implements EstadoDeUmOrcamento {
    private boolean descontoAplicado = false;
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.02;
            descontoAplicado = true;
        }
        else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    public void aprova(Orcamento orcamento) {
        // jah estou em aprovacao
        throw new RuntimeException("Orçamento já está em estado de aprovação");
    }

    public void reprova(Orcamento orcamento) {
        // nao pode ser reprovado agora!
        throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
    }

    public void finaliza(Orcamento orcamento) {
        // daqui posso ir para o estado de finalizado
        orcamento.estadoAtual = new Finalizado();
    }
}
