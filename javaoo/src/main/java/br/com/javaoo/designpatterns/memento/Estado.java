package br.com.javaoo.designpatterns.memento;

/**
 * Created by david on 25/12/16.
 */
public class Estado {
    private Contrato contrato;

    public Estado(Contrato contrato) {
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }
}
