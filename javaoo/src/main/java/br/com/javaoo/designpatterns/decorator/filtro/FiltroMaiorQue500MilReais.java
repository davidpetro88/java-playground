package br.com.javaoo.designpatterns.decorator.filtro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 21/12/16.
 */
class FiltroMaiorQue500MilReais extends Filtro {
    public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
        super(outroFiltro);
    }

    public FiltroMaiorQue500MilReais() {
        super();
    }

    public List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrada = new ArrayList<Conta>();
        for(Conta c : contas) {
            if(c.getValor() > 500000.00) filtrada.add(c);
        }

        filtrada.addAll(proximo(contas));
        return filtrada;
    }
}