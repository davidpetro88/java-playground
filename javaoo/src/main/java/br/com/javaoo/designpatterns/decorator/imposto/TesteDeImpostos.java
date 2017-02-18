package br.com.javaoo.designpatterns.decorator.imposto;

/**
 * Created by david on 21/12/16.
 */
public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto impostos = new ISS(new ICMS());
        Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new ICMS());
        Imposto ikvc = new IKCV(new ICMS());
        Imposto icpp = new ICPP(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        System.out.println(impostos.calcula(orcamento));
        System.out.println(impostoMuitoAlto.calcula(orcamento));
        System.out.println(ikvc.calcula(orcamento));
        System.out.println(icpp.calcula(orcamento));
    }
}
