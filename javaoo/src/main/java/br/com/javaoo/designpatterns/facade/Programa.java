package br.com.javaoo.designpatterns.facade;

/**
 * Created by david on 26/12/16.
 */
public class Programa {

    public static void main(String[] args) {
        EmpresaFacade facade = new EmpresaFacade();
        Cliente cliente = facade.buscaCliente("2656352163");
        facade.criaFatura(cliente, 100.00);
    }
}
