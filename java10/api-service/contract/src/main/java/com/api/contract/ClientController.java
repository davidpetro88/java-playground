package com.api.contract;

import com.api.impl.database.Client;
import com.api.impl.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Client insert(@RequestBody Client client) {
        return clientService.insert(client);
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Client findById(@PathVariable("id") String id) {
        return clientService.findById(id);
    }
}
