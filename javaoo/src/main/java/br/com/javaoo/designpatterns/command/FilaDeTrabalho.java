package br.com.javaoo.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 26/12/16.
 */
public class FilaDeTrabalho {
    private List<Comando> comandos;

    public FilaDeTrabalho() {
        comandos = new ArrayList<Comando>();
    }

    public void adiciona(Comando comando) {
        comandos.add(comando);
    }

    public void processa() {
        for(Comando comando : comandos) {
            comando.executa();
        }
    }
}
