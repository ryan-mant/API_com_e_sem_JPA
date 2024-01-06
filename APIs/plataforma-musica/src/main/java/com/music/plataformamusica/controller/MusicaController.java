package com.music.plataformamusica.controller;

import com.music.plataformamusica.model.Musica;
import com.music.plataformamusica.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musicas")
@CrossOrigin("*")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @GetMapping
    public ResponseEntity<List<Musica>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(musicaService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Musica>> getById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(musicaService.getById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody Musica musica){
        return ResponseEntity.status(HttpStatus.CREATED).body(musicaService.save(musica));
    }
    @PutMapping
    public ResponseEntity<Musica> update(@RequestBody Musica musica){
        return ResponseEntity.status(HttpStatus.OK).body(musicaService.put(musica));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Musica> delete(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(musicaService.delete(id));
    }
}
