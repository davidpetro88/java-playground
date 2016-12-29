package br.com.javaoo.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 25/12/16.
 */
public class Historico {
    private List<Estado> estadosSalvos = new ArrayList<Estado>();

    public Estado pega(int index) {
        return estadosSalvos.get(index);
    }

    public void adiciona(Estado estado) {
        estadosSalvos.add(estado);
    }
}
