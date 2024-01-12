package com.metro.linha.repository;

import com.metro.linha.model.Linha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinhaRepository extends JpaRepository<Linha, Integer> {
}
