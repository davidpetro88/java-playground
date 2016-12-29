package br.com.javaoo.designpatterns.state.orcamento;

/**
 * Created by david on 22/12/16.
 */
interface EstadoDeUmOrcamento {
    void aplicaDescontoExtra(Orcamento orcamento);
    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}
