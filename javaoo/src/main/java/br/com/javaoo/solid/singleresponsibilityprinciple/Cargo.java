package br.com.javaoo.solid.singleresponsibilityprinciple;

/**
 * Created by david on 26/12/16.
 */
public enum Cargo {

    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new DezOuVintePorCento()),
    TESTER(new QuinzeOuVinteECincoPorCento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra)  {
        this.regra = regra;
    }
    public RegraDeCalculo getRegra()  {
        return regra;
    }
}
