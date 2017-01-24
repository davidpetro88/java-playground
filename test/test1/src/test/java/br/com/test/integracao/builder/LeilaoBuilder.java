package br.com.test.integracao.builder;

import br.com.test.integracao.dominio.Lance;
import br.com.test.integracao.dominio.Leilao;
import br.com.test.integracao.dominio.Usuario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by david on 31/12/16.
 */
public class LeilaoBuilder {

    private Usuario dono;
    private double valor;
    private String nome;
    private boolean usado;
    private Calendar dataAbertura;
    private boolean encerrado;
    private List<Lance> listLances;
    private Leilao leilao;

    public LeilaoBuilder() {
        this.dono = new Usuario("Joao da Silva", "joao@silva.com.br");
        this.valor = 1500.0;
        this.nome = "XBox";
        this.usado = false;
        this.dataAbertura = Calendar.getInstance();
        this.listLances = new ArrayList<Lance>();
    }

    public LeilaoBuilder(double valor, String nome, boolean usado, boolean encerrado) {
        this.valor = valor;
        this.nome = nome;
        this.usado = usado;
        this.encerrado = encerrado;
    }

    public LeilaoBuilder comDono(Usuario dono) {
        this.dono = dono;
        return this;
    }

    public LeilaoBuilder comValor(double valor) {
        this.valor = valor;
        return this;
    }

    public LeilaoBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public LeilaoBuilder usado() {
        this.usado = true;
        return this;
    }

    public LeilaoBuilder encerrado() {
        this.encerrado = true;
        return this;
    }

    public LeilaoBuilder diasAtras(int dias) {
        Calendar data = Calendar.getInstance();
        data.add(Calendar.DAY_OF_MONTH, -dias);
        this.dataAbertura = data;
        return this;
    }

    public LeilaoBuilder comLance(Calendar data, Usuario usuario, double valor) {
        listLances.add(new Lance(data, usuario, valor));
        return this;
    }

    public Leilao constroi() {
        leilao = new Leilao(nome, valor, dono, usado);
        leilao.setDataAbertura(dataAbertura);
        listLances.forEach( lance -> {
            leilao.adicionaLance(lance);
        });
        if(encerrado) leilao.encerra();
        return leilao;
    }
}