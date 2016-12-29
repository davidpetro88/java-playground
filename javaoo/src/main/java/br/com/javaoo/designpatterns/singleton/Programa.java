package br.com.javaoo.designpatterns.singleton;


/**
 * Created by david on 26/12/16.
 */
public class Programa {

    public static void main(String[] args) {
        EmpresaFacade instancia = new EmpresaFacadeSingleton().getInstancia();
        Cliente cliente = instancia.buscaCliente("2656352163");
        instancia.criaFatura(cliente, 100.00);
    }
}
