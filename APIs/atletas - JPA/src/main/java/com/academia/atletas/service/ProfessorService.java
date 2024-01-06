package com.academia.atletas.service;

import com.academia.atletas.model.Professor;
import com.academia.atletas.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> findAll(){
        return professorRepository.findAll();
    }
    public Professor save(Professor professor){
        return professorRepository.save(professor);
    }
}
