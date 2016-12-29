package br.com.javaoo.designpatterns.flyweight;

import org.jfugue.player.Player;

import java.util.List;

/**
 * Created by david on 25/12/16.
 */
public class Piano {

    public void toca(List<Nota> musica) {
        Player player = new Player();

        StringBuilder musicaEmNotas = new StringBuilder();
        for(Nota nota : musica) {
            musicaEmNotas.append(nota.simbolo() + " ");
        }
        System.out.println("musica = [" + musica + "]");
        player.play(musicaEmNotas.toString());
    }
}
