package com.academia.atletas.controlller;

import com.academia.atletas.model.Atleta;
import com.academia.atletas.repository.AtletaRepository;
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
    private AtletaRepository atletaRepository;

    @GetMapping
    public ResponseEntity<List<Atleta>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(atletaRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Atleta>> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(atletaRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody Atleta atleta){
        return ResponseEntity.status(HttpStatus.CREATED).body(atletaRepository.save(atleta));
    }
    @PutMapping
    public ResponseEntity<Atleta> update(@RequestBody Atleta atleta){
        return ResponseEntity.status(HttpStatus.OK).body(atletaRepository.update(atleta));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Atleta> updateDataDeAssinatura(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(atletaRepository.updateDataAssinatura(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Atleta>> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(atletaRepository.deleteById(id));
    }

}
