package br.com.javaoo.solid.dip;

/**
 * Created by david on 28/12/16.
 */
public class Lampada implements Dispositivo {
    public void ligar() {
        System.out.println("Ligou a tomada");
    }

    public void desligar() {
        System.out.println("Desligou");
    }
}
