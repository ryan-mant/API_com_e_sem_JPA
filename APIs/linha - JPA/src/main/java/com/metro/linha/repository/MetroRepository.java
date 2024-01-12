package com.metro.linha.repository;

import com.metro.linha.model.Metro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetroRepository extends JpaRepository<Metro, Integer> {
}
