package br.com.javaoo.designpatterns.singleton;

/**
 * Created by david on 26/12/16.
 */
public class ClienteDao {
    public Cliente buscaPorCpf(String cpf) {
        return new Cliente();
    }
}
