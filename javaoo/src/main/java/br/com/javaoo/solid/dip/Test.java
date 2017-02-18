package br.com.javaoo.solid.dip;

/**
 * Created by david on 28/12/16.
 */
public class Test {

    public static void main(String[] args) {
        Dispositivo lampada = new Lampada();
        Interruptor interruptor = new Interruptor(lampada);
        interruptor.acaoDeLigarLuz();
        interruptor.acaoDesligarLuz();
    }
}
