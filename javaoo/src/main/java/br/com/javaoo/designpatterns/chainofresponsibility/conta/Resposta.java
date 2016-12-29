package br.com.javaoo.designpatterns.chainofresponsibility.conta;

/**
 * Created by david on 20/12/16.
 */
interface Resposta {
    void responde(Requisicao req, Conta conta);
}