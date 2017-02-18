package br.com.javaoo.designpatterns.memento;

import java.util.Calendar;

/**
 * Created by david on 25/12/16.
 */
public class Programa {

    public static void main(String[] args) {
        Historico historico = new Historico();

        Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio", TipoContrato.NOVO);
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        Estado estadoAnterior = historico.pega(1);
        System.out.println("estadoAnterior = " + estadoAnterior.getContrato().getTipo());
    }
}
