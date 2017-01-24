package br.com.test.unitario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 30/12/16.
 */
public class FiltroDeLances {

    public List<Lance> filtra(List<Lance> lances) {
        ArrayList<Lance> resultado = new ArrayList<Lance>();

        for(Lance lance : lances) {
            if(lance.getValor() > 1000 && lance.getValor() < 3000)
                resultado.add(lance);
            else if(lance.getValor() > 500 && lance.getValor() < 700)
                resultado.add(lance);
            else if(lance.getValor() > 5000)
                resultado.add(lance);
        }

        return resultado;
    }
}