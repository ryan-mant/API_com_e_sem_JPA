package com.consultor.consultapreco.controller;

import com.consultor.consultapreco.model.Produto;
import com.consultor.consultapreco.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produtos")
@CrossOrigin("*")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<Produto>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<String>save(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
    }
    @PutMapping
    public ResponseEntity<Produto> update(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.update(produto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.deleteById(id));
    }
}
