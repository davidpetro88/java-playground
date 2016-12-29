package br.com.javaoo.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by david on 24/12/16.
 */
public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();

    static {
        notas.put("do", new Do());
        notas.put("do sustenido", new DoSustenido());
        notas.put("re", new Re());
        notas.put("re sustenido", new ReSustenido());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());

    }
    public Nota pega(String nome) {
        return notas.get(nome);
    }
}
