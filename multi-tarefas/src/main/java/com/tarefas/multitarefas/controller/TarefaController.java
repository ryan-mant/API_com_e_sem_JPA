package com.tarefas.multitarefas.controller;

import com.tarefas.multitarefas.model.Tarefa;
import com.tarefas.multitarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
@CrossOrigin("*")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public ResponseEntity<List<Tarefa>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Tarefa>> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.getById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody Tarefa tarefa){
        return ResponseEntity.status(HttpStatus.CREATED).body(tarefaService.save(tarefa));
    }
    @PutMapping
    public ResponseEntity<Tarefa> put(@RequestBody Tarefa tarefa){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.put(tarefa));
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> putEstaAbertaById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.putEstaAbertaById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Tarefa> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.deleteById(id));
    }
}
