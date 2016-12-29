package br.com.javaoo.designpatterns.chainofresponsibility.conta;

/**
 * Created by david on 20/12/16.
 */
class RespostaEmPorcento implements Resposta {
    private Resposta outraResposta;

    public RespostaEmPorcento(Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    public RespostaEmPorcento() {
        this.outraResposta = null;
    }

    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.PORCENTO) {
            System.out.println(conta.getTitular() + '%' + conta.getSaldo());
        } else if(outraResposta != null){
            outraResposta.responde(req, conta);
        } else {
            throw new RuntimeException("Formato de resposta não encontrado");
        }
    }
}