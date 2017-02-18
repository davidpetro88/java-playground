package br.com.javaoo.solid.dip;

/**
 * Created by david on 28/12/16.
 */
public class Interruptor {
    private Dispositivo dispositivo;
    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void acaoDeLigarLuz()
    {
        dispositivo.ligar();
    }

    public void acaoDesligarLuz()
    {
        dispositivo.desligar();
    }
}
