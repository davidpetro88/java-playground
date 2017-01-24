package br.com.test.unitario.builder;

import br.com.test.unitario.Lance;
import br.com.test.unitario.Leilao;
import br.com.test.unitario.Usuario;

/**
 * Created by david on 30/12/16.
 */
public class CriadorDeLeilao {
    private Leilao leilao;

    public CriadorDeLeilao() {
    }

    public CriadorDeLeilao para(String descricao) {
        this.leilao = new Leilao(descricao);
        return this;
    }

    public CriadorDeLeilao lance(Usuario usuario, double valor) {
        leilao.propoe(new Lance(usuario, valor));
        return this;
    }

    public Leilao constroi() {
        return leilao;
    }
}
