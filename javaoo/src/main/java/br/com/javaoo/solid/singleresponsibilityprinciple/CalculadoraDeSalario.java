package br.com.javaoo.solid.singleresponsibilityprinciple;

/**
 * Created by david on 26/12/16.
 */
public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario){
        return funcionario.calculaSalario();
    }
}
