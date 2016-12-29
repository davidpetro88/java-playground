package br.com.javaoo.designpatterns.singleton;

/**
 * Created by david on 26/12/16.
 */
public class EmpresaFacadeSingleton {
    private static EmpresaFacade instancia;

    public EmpresaFacade getInstancia() {
        if(instancia == null) {
            instancia = new EmpresaFacade();
        }

        return instancia;
    }
}

