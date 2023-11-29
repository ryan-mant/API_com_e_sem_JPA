package com.tarefas.multitarefas.controller;

import com.tarefas.multitarefas.model.Tarefa;
import com.tarefas.multitarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Tarefa> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.getById(id));
    }
    @PostMapping
    public ResponseEntity<Tarefa> save(@RequestBody Tarefa tarefa){
        return ResponseEntity.status(HttpStatus.CREATED).body(tarefaService.save(tarefa));
    }
    @PutMapping
    public ResponseEntity<Tarefa> update(@RequestBody Tarefa tarefa){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.update(tarefa));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> updateEstaAberta(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.updateEstaAberta(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Tarefa> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.deleteById(id));
    }
}
