package br.com.javaoo.designpatterns.templatemethod.imposto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 20/12/16.
 */
public class IHIT extends TemplateDeImpostoCondicional {
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<String>();
        for(Item item : orcamento.getItens()) {
            if(noOrcamento.contains(item.getNome())) return true;
            else noOrcamento.add(item.getNome());
        }
        return false;
    }
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }
}