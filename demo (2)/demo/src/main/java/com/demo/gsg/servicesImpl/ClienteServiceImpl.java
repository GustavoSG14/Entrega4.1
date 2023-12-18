package com.demo.gsg.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gsg.model.Cliente;
import com.demo.gsg.repositories.ClienteRepository;
import com.demo.gsg.services.ClienteService;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Long id, Cliente clienteAtualizada) {
        Cliente clienteExistente = clienteRepository.findById(id).orElse(null);
        if (clienteExistente != null) {
            clienteExistente.setNome(clienteAtualizada.getNome());
            clienteExistente.setCpf(clienteAtualizada.getCpf());
            return clienteRepository.save(clienteExistente);
        } else {
            throw new RuntimeException("Cliente com o ID " + id + " não encontrada.");
        }
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}

