package com.demo.gsg.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gsg.model.Compras;
import com.demo.gsg.repositories.ComprasRepository;
import com.demo.gsg.services.ComprasService;

import org.springframework.transaction.annotation.Transactional;

@Service
public class ComprasServiceImpl implements ComprasService {

    @Autowired
    private ComprasRepository comprasRepository;

    @Override
    public List<Compras> getAllCompras() {
        return comprasRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Compras getComprasById(Long id) {
        return comprasRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void saveCompras(Compras compras) {
        comprasRepository.save(compras);
    }

    @Override
    @Transactional
    public void updateCompras(Long id, Compras comprasAtualizada) {
        Compras comprasExistente = comprasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Compras com o ID " + id + " não encontrada."));

        comprasExistente.setValor(comprasAtualizada.getValor());
        comprasExistente.setPagamento(comprasAtualizada.getPagamento());
      
    }

    @Override
    @Transactional
    public void deleteCompras(Long id) {
        comprasRepository.deleteById(id);
    }

	@Override
	public Compras saveCliente(Compras compras) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compras updateCliente(Long id, Compras comprasAtualizada) {
		// TODO Auto-generated method stub
		return null;
	}
}

