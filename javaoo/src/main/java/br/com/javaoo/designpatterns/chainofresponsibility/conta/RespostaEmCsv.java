package br.com.javaoo.designpatterns.chainofresponsibility.conta;

/**
 * Created by david on 20/12/16.
 */
class RespostaEmCsv implements Resposta {
    private Resposta outraResposta;

    public RespostaEmCsv(Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.CSV) {
            System.out.println(conta.getTitular() + "," + conta.getSaldo());
        }
        else {
            outraResposta.responde(req, conta);
        }
    }
}