package br.com.javaoo.designpatterns.templatemethod.imposto;


/**
 * Created by david on 20/12/16.
 */
public class TestTemplateMethod {

    public static void main(String[] args) {

        Orcamento orcamentoMaior500 = new Orcamento(600.00);
        orcamentoMaior500.adicionaItem(new Item("TESTE", 200.00));
        orcamentoMaior500.adicionaItem(new Item("TESTE 2", 400.00));

        Orcamento orcamentoMenor500 = new Orcamento(400.00);
        orcamentoMenor500.adicionaItem(new Item("TESTE", 400.00));

        ICPP icpp = new ICPP();
        System.out.println(icpp.calcula(orcamentoMaior500));
        System.out.println(icpp.calcula(orcamentoMenor500));


        IKCV ikcv = new IKCV();
        System.out.println(ikcv.calcula(orcamentoMaior500));
        System.out.println(ikcv.calcula(orcamentoMenor500));

        IHIT ihit = new IHIT();
        System.out.println(ihit.calcula(orcamentoMaior500));
        System.out.println(ihit.calcula(orcamentoMenor500));

    }
}
