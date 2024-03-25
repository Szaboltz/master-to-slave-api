package com.mastertoslave.demo.controllers;

import com.mastertoslave.demo.modals.ClienteModal;
import com.mastertoslave.demo.services.ClienteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping(value = "/cliente/add", consumes = {"application/json"})
    public void addCliente(@RequestBody ClienteModal clienteModal) {
      clienteService.addCliente(clienteModal);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/cliente/find/master")
    public List getAllBooksFromMaster() {
        return clienteService.getAllClientesFromMaster();
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/cliente/find/slave")
    public List getAllBooksFromSlave() {
        return clienteService.getAllClientesFromSlave();
    }
}