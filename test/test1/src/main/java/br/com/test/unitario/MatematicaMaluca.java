package br.com.test.unitario;

/**
 * Created by david on 30/12/16.
 */
public class MatematicaMaluca {
    public int contaMaluca(int numero) {
        if (numero > 30)
            return numero * 4;
        else if (numero > 10)
            return numero * 3;
        else
            return numero * 2;
    }
}
