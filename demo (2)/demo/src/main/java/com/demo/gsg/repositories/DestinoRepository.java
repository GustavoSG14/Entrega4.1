package com.demo.gsg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.gsg.model.Destino;

@Repository 
public interface DestinoRepository extends JpaRepository<Destino, Long>{

}
