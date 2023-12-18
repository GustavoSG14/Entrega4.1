package com.demo.gsg.services;

import java.util.List;

import com.demo.gsg.model.Destino;

public interface DestinoService {
	 
	    List<Destino> getAllDestino();

	    Destino getDestinoById(Long id);

	    Destino saveDestino(Destino destino);

	    Destino updateDestino(Long id, Destino destinoAtualizada);

	    void deleteDestino(Long id);
	

}

