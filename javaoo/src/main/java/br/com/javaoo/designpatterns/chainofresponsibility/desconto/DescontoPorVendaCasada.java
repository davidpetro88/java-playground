package br.com.javaoo.designpatterns.chainofresponsibility.desconto;

/**
 * Created by david on 20/12/16.
 */
public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    public double desconta(Orcamento orcamento) {
        if(aconteceuVendaCasadaEm(orcamento)) return orcamento.getValor() * 0.05;
        else return proximo.desconta(orcamento);
    }

    private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
        return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
    }

    private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
