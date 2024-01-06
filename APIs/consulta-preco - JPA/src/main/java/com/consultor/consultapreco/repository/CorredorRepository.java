package com.consultor.consultapreco.repository;

import com.consultor.consultapreco.model.Corredor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorredorRepository extends JpaRepository<Corredor, Integer> {
}
