package com.consultor.consultapreco.controller;

import com.consultor.consultapreco.model.Produto;
import com.consultor.consultapreco.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
@CrossOrigin("*")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>>getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produto));
    }

    @PutMapping
    public ResponseEntity<Produto> update(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.update(produto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.deleteById(id));
    }
}
