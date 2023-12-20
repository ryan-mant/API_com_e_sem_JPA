package com.academia.atletas.controller;

import com.academia.atletas.model.Professor;
import com.academia.atletas.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professores")
@CrossOrigin("*")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public ResponseEntity<List<Professor>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(professorService.findAll());
    }
    @PostMapping
    public ResponseEntity<Professor> save(@RequestBody Professor professor){
        return ResponseEntity.status(HttpStatus.CREATED).body(professorService.save(professor));
    }
}
