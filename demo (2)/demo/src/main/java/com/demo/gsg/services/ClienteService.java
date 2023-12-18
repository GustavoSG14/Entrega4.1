package com.demo.gsg.services;

import java.util.List;

import com.demo.gsg.model.Cliente;

public interface ClienteService {
	 
	    List<Cliente> getAllCliente();

	    Cliente getClienteById(Long id);

	    Cliente saveCliente(Cliente cliente);

	    Cliente updateCliente(Long id, Cliente clienteAtualizada);

	    void deleteCliente(Long id);
	

}

