package br.com.javaoo.designpatterns.observer;

/**
 * Created by david on 23/12/16.
 */
public class Impressora implements AcaoAposGerarNota{
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("enviando para impressora");
    }
}
