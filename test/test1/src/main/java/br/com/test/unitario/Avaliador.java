package br.com.test.unitario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by david on 29/12/16.
 */
public class Avaliador {

    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;
    private List<Lance> maiores;
    private double media = 0;

    public void avalia(Leilao leilao) {
        // lancando a excecao
        if(leilao.getLances().size() ==0) throw new RuntimeException("Não é possível avaliar um leilão sem lances");
        double total = 0;
        for(Lance lance : leilao.getLances()) {
            if(lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
            if (lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
            total += lance.getValor();
        }
        media = total / leilao.getLances().size();
        pegaOsMaioresNo(leilao);
    }

    private void pegaOsMaioresNo(Leilao leilao) {
        maiores = new ArrayList<Lance>(leilao.getLances());
        Collections.sort(maiores, new Comparator<Lance>() {
            public int compare(Lance o1, Lance o2) {
                if(o1.getValor() < o2.getValor()) return 1;
                if(o1.getValor() > o2.getValor()) return -1;
                return 0;
            }
        });
        maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());
    }

    public List<Lance> getTresMaiores() {
        return this.maiores;
    }
    public double getMaiorLance() {
        return maiorDeTodos;
    }
    public double getMenorLance() {
        return menorDeTodos;
    }
    public double getMedia() { return media; }
}