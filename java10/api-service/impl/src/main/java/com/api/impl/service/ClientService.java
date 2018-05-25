package com.api.impl.service;

import com.api.impl.database.Client;
import com.api.impl.database.ClientRepository;

import java.util.List;
import java.util.Optional;

public class ClientService {

    private ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public Client insert(Client client) {
        return repository.insert(client);
    }

    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client findById(String id) {
        var message = "Id is required";
        return repository.findById(Optional.ofNullable(id).orElseThrow(() -> new RuntimeException(message)))
                .orElseThrow(() -> new RuntimeException("Client Not Found"));
    }
}
