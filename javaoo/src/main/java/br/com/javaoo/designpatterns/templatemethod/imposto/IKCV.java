package br.com.javaoo.designpatterns.templatemethod.imposto;

/**
 * Created by david on 20/12/16.
 */
class IKCV extends TemplateDeImpostoCondicional {
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (Item item : orcamento.getItens()){
            if(item.getValor() > 100) return true;
        }
        return false;
    }
}