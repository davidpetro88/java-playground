package br.com.javaoo.solid.opencloseedip;

/**
 * Created by david on 28/12/16.
 */
public class CalculadoraDePrecos {

    private TabelaDePreco tabela;
    private ServicoDeEntrega servicoDeEntrega;

    public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega servicoDeEntrega) {
        this.tabela = tabela;
        this.servicoDeEntrega = servicoDeEntrega;
    }

    public double calcula(Compra produto){
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = servicoDeEntrega.para(produto.getCidade());

        return produto.getValor() * (1 - desconto) + frete;
    }
}