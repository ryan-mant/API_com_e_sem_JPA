package entregadora.correio.controller;

import entregadora.correio.model.Transporte;
import entregadora.correio.service.TransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("transportes")
@CrossOrigin("*")
public class TranspoteController {
    @Autowired
    private TransporteService transporteService;

    @GetMapping
    public ResponseEntity<List<Transporte>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(transporteService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Transporte>> findById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(transporteService.findById(id));
    }
    @PostMapping("/adicionar-transporte")
    public ResponseEntity<Transporte> save(@RequestBody Transporte transporte){
        return ResponseEntity.status(HttpStatus.CREATED).body(transporteService.save(transporte));
    }
    @PutMapping("/atualizar-transporte")
    public ResponseEntity<Transporte> update(@RequestBody Transporte transporte){
        return ResponseEntity.status(HttpStatus.OK).body(transporteService.update(transporte));
    }
    @DeleteMapping("/deletar-transporte/{id}")
    public ResponseEntity<Transporte> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(transporteService.deleteById(id));
    }
}
