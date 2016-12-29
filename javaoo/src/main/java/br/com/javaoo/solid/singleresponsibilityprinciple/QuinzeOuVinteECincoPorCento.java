package br.com.javaoo.solid.singleresponsibilityprinciple;

/**
 * Created by david on 26/12/16.
 */
public class QuinzeOuVinteECincoPorCento implements RegraDeCalculo{
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
