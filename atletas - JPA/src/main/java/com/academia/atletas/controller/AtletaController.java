package com.academia.atletas.controller;

import com.academia.atletas.model.Atleta;
import com.academia.atletas.service.AtletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("atletas")
@CrossOrigin("*")
public class AtletaController {
    @Autowired
    private AtletaService atletaService;

    @GetMapping
    public ResponseEntity<List<Atleta>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(atletaService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Atleta>> findById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(atletaService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Atleta> save(@RequestBody Atleta atleta){
        return ResponseEntity.status(HttpStatus.CREATED).body(atletaService.save(atleta));
    }
    @PutMapping
    public ResponseEntity<Atleta> update(@RequestBody Atleta atleta){
        return ResponseEntity.status(HttpStatus.OK).body(atletaService.update(atleta));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Atleta> updateDataDeAssinatura(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(atletaService.updateDataDeAssinatura(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Atleta> deletById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(atletaService.deleteById(id));
    }
}
