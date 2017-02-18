package br.com.javaoo.designpatterns.facade;

/**
 * Created by david on 26/12/16.
 */
public class ClienteDao {
    public Cliente buscaPorCpf(String cpf) {
        return new Cliente();
    }
}
