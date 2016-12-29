package br.com.javaoo.designpatterns.chainofresponsibility.conta;

/**
 * Created by david on 20/12/16.
 */
class RespostaEmXml implements Resposta {
    private Resposta outraResposta;

    public RespostaEmXml(Resposta outraResposta) {
        this.outraResposta = outraResposta;
    }

    public void responde(Requisicao req, Conta conta) {
        if(req.getFormato() == Formato.XML) {
            System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
        }
        else {
            outraResposta.responde(req, conta);
        }
    }
}
