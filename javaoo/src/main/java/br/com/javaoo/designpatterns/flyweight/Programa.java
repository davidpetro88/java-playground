package br.com.javaoo.designpatterns.flyweight;

import java.util.Arrays;
import java.util.List;

/**
 * Created by david on 24/12/16.
 */
public class Programa {

    public static void main(String[] args) {
        NotasMusicais notasMusicais = new NotasMusicais();
        List<Nota> musica = Arrays.asList(
                notasMusicais.pega("do"),
                notasMusicais.pega("re"),
                notasMusicais.pega("mi"),
                notasMusicais.pega("fa"),
                notasMusicais.pega("fa"),
                notasMusicais.pega("fa"));
        Piano piano = new Piano();
        piano.toca(musica);
    }
}
