package br.com.javaoo.designpatterns.decorator.filtro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 21/12/16.
 */
abstract class Filtro {
    protected Filtro outroFiltro;

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public Filtro() {}

    public abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> proximo(List<Conta> contas) {
        if(outroFiltro != null) return outroFiltro.filtra(contas);
        else return new ArrayList<Conta>();
    }
}