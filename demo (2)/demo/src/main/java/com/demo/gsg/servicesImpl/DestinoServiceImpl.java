package com.demo.gsg.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.gsg.model.Destino;
import com.demo.gsg.repositories.DestinoRepository;
import com.demo.gsg.services.DestinoService;

import org.springframework.transaction.annotation.Transactional;

@Service
public class DestinoServiceImpl implements DestinoService {

    @Autowired
    private DestinoRepository destinoRepository;

    @Override
    public List<Destino> getAllDestino() {
        return destinoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Destino getDestinoById(Long id) {
        return destinoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Destino saveDestino(Destino destino) {
        return destinoRepository.save(destino);
    }

    @Override
    @Transactional
    public Destino updateDestino(Long id, Destino destinoAtualizada) {
        Destino destinoExistente = destinoRepository.findById(id).orElse(null);
        if (destinoExistente != null) {
            destinoExistente.setPaís(destinoAtualizada.getPaís());
            destinoExistente.setCidade(destinoAtualizada.getCidade());
            return destinoRepository.save(destinoExistente);
        } else {
            throw new RuntimeException("Destino com o ID " + id + " não encontrada.");
        }
    }

    @Override
    @Transactional
    public void deleteDestino(Long id) {
        destinoRepository.deleteById(id);
    }
}
