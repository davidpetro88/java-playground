package br.com.javaoo.designpatterns.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by david on 23/12/16.
 */
public class NotaFiscalBuilder {
    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;
    List<AcaoAposGerarNota> todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();


    public NotaFiscalBuilder() {
        this.data = Calendar.getInstance();
        this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
    }

    public NotaFiscalBuilder(List<AcaoAposGerarNota> acaoAposGerarNotas) {
        this.data = Calendar.getInstance();
        this.todasAcoesASeremExecutadas.addAll(acaoAposGerarNotas);
    }

    public void adicionaAcao(AcaoAposGerarNota novaAcao) {
        this.todasAcoesASeremExecutadas.add(novaAcao);
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;

        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;

        return this;
    }

    public NotaFiscalBuilder naData(Calendar novaData) {
        this.data = novaData;
        return this;
    }

    public NotaFiscal constroi() {
        NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
            acao.executa(notaFiscal);
        }
        return notaFiscal;
    }
}