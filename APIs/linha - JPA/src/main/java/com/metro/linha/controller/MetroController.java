package com.metro.linha.controller;

import com.metro.linha.model.Metro;
import com.metro.linha.service.MetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("metros")
@CrossOrigin("*")
public class MetroController {
    @Autowired
    private MetroService metroService;

    @GetMapping
    public ResponseEntity<List<Metro>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(metroService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Metro>> findById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(metroService.findById(id));
    }
    @PostMapping("/adicionar-metro")
    public ResponseEntity<Metro> save(@RequestBody Metro metro){
        return ResponseEntity.status(HttpStatus.CREATED).body(metroService.save(metro));
    }
    @PutMapping("/atualizar-metro")
    public ResponseEntity<Metro> update(@RequestBody Metro metro){
        return ResponseEntity.status(HttpStatus.OK).body(metroService.update(metro));
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Metro> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(metroService.deleteById(id));
    }
}
