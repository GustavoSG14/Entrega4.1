package com.demo.gsg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.gsg.model.Compras;

@Repository 
public interface ComprasRepository extends JpaRepository<Compras, Long> {

}
