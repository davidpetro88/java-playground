package br.com.javaoo.designpatterns.chainofresponsibility.conta;

/**
 * Created by david on 20/12/16.
 */
public class TestRequisicaoContaBancaria {

    public static void main(String[] args) {
        Resposta r1 = new RespostaEmXml(new RespostaEmCsv(new RespostaEmPorcento(new SemResposta())));
        Resposta r2 = new RespostaEmXml(new RespostaEmCsv(new RespostaEmPorcento()));

        Requisicao reqXml = new Requisicao(Formato.XML);
        Requisicao reqCsv = new Requisicao(Formato.CSV);
        Requisicao reqPorcentagem = new Requisicao(Formato.PORCENTO);
        Requisicao reqError = new Requisicao(Formato.FORMATO_NAO_MAPEADO);

        Conta conta = new Conta("Cevoscleu Silvani", 100.00);
        r1.responde(reqXml,conta);
        r1.responde(reqCsv,conta);
        r1.responde(reqPorcentagem,conta);
        r1.responde(reqError,conta);

        r2.responde(reqXml,conta);
        r2.responde(reqCsv,conta);
        r2.responde(reqPorcentagem,conta);
        r2.responde(reqError,conta);
    }
}
