package br.com.javaoo.designpatterns.state.orcamento;

/**
 * Created by david on 22/12/16.
 */
class EmAprovacao implements EstadoDeUmOrcamento {
    private boolean descontoAplicado = false;
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if(!descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.05;
            descontoAplicado = true;
        }
        else {
            throw new RuntimeException("Desconto já aplicado!");
        }
    }

    public void aprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de aprovado
        orcamento.estadoAtual = new Aprovado();
    }

    public void reprova(Orcamento orcamento) {
        // desse estado posso ir para o estado de reprovado tambem
        orcamento.estadoAtual = new Reprovado();
    }

    public void finaliza(Orcamento orcamento) {
        // daqui não posso ir direto para finalizado
        throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
    }
}