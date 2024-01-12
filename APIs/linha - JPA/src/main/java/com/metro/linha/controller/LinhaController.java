package com.metro.linha.controller;

import com.metro.linha.model.Linha;
import com.metro.linha.service.LinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("linhas")
@CrossOrigin("*")
public class LinhaController {
    @Autowired
    private LinhaService linhaService;
    @GetMapping
    public ResponseEntity<List<Linha>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(linhaService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Linha>> findById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(linhaService.findById(id));
    }
    @PostMapping("/adicionar-linha")
    public ResponseEntity<Linha> save(@RequestBody Linha linha){
        return ResponseEntity.status(HttpStatus.CREATED).body(linhaService.save(linha));
    }
    @PutMapping("/atualizar-linha")
    public ResponseEntity<Linha> update(@RequestBody Linha linha){
        return ResponseEntity.status(HttpStatus.OK).body(linhaService.update(linha));
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Linha> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(linhaService.deleteById(id));
    }
}
