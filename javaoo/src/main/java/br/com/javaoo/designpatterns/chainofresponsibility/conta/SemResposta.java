package br.com.javaoo.designpatterns.chainofresponsibility.conta;

/**
 * Created by david on 20/12/16.
 */
public class SemResposta implements Resposta {

    public void responde(Requisicao req, Conta conta) {
        System.out.println("Resposta Não encontrada");
    }

    public void setProxima(Resposta resposta) {

    }
}
