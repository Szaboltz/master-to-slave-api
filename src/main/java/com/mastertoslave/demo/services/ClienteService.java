package com.mastertoslave.demo.services;

import com.mastertoslave.demo.modals.ClienteModal;
import com.mastertoslave.demo.repositories.ClienteReadOnlyRepository;
import com.mastertoslave.demo.repositories.ClienteReadWriteRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteReadWriteRepository clienteReadWriteRepository;
    private ClienteReadOnlyRepository clienteReadOnlyRepository;

    public ClienteService(ClienteReadWriteRepository clienteReadWriteRepository, ClienteReadOnlyRepository clienteReadOnlyRepository) {
        this.clienteReadOnlyRepository = clienteReadOnlyRepository;
        this.clienteReadWriteRepository = clienteReadWriteRepository;
    }

    @SuppressWarnings("null")
    public void addCliente(ClienteModal clienteModal) {
        clienteReadWriteRepository.saveAndFlush(clienteModal);
    }

    @SuppressWarnings("rawtypes")
    public List getAllClientesFromMaster() {
        return clienteReadWriteRepository.findAll();
    }

    @SuppressWarnings("rawtypes")
    public List getAllClientesFromSlave() {
        return clienteReadOnlyRepository.findAll();
    }
}
