package br.com.test.unitario;

/**
 * Created by david on 30/12/16.
 */
public class AnoBissexto {
    public boolean getAnoBissexto(int ano) {
        if (((ano % 4) == 0) && ((ano % 100) != 0)) return true;
        if ((ano % 400) == 0) return true;
        return false;
    }
}
