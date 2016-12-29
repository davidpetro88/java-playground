package br.com.javaoo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 23/12/16.
 */
public class TesteAcoes {
    public static void main(String[] args) {

        List<AcaoAposGerarNota> acaoAposGerarNotas = new ArrayList<AcaoAposGerarNota>();
        acaoAposGerarNotas.add(new EnviadorDeEmail());
        acaoAposGerarNotas.add(new NotaFiscalDao());
        acaoAposGerarNotas.add(new EnviadorDeSms());
        acaoAposGerarNotas.add(new Impressora());
        acaoAposGerarNotas.add(new Multiplicador(2));
        acaoAposGerarNotas.add(new Multiplicador(3));
        acaoAposGerarNotas.add(new Multiplicador(5.5));


        NotaFiscalBuilder builder = new NotaFiscalBuilder(acaoAposGerarNotas);
/*
        builder.adicionaAcao(new EnviadorDeEmail());
        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new EnviadorDeSms());
        builder.adicionaAcao(new Impressora());
        builder.adicionaAcao(new Multiplicador(2));
        builder.adicionaAcao(new Multiplicador(3));
        builder.adicionaAcao(new Multiplicador(5.5));
*/

        NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
                .comCnpj("123.456.789/0001-10")
                .comItem(new ItemDaNota("item 1", 100.0))
                .comItem(new ItemDaNota("item 2", 200.0))
                .comItem(new ItemDaNota("item 3", 300.0))
                .comObservacoes("entregar notaFiscal pessoalmente")
                .constroi();

        System.out.println(notaFiscal.getValorBruto());
    }
}
