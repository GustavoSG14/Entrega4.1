package com.demo.gsg.services;

import java.util.List;

import com.demo.gsg.model.Compras;

public interface ComprasService {
	 
	    List<Compras> getAllCompras();

	    Compras getComprasById(Long id);

	    Compras saveCliente(Compras compras);

	    Compras updateCliente(Long id, Compras comprasAtualizada);

	    void deleteCompras(Long id);

		void saveCompras(Compras compras);

		void updateCompras(Long id, Compras comprasAtualizada);
	

}

