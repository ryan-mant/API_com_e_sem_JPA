package entregadora.correio.controller;

import entregadora.correio.model.Pacote;
import entregadora.correio.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pacotes")
@CrossOrigin("*")
public class PacoteController {
    @Autowired
    private PacoteService pacoteService;

    @GetMapping
    public ResponseEntity<List<Pacote>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pacote>> findById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteService.findById(id));
    }
    @PostMapping("/adicionar-pacote")
    public ResponseEntity<Pacote> save(@RequestBody Pacote pacote){
        return ResponseEntity.status(HttpStatus.CREATED).body(pacoteService.save(pacote));
    }
    @PutMapping("/atualizar-pacote")
    public ResponseEntity<Pacote> update(@RequestBody Pacote pacote){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteService.update(pacote));
    }
    @DeleteMapping("/deletar-pacote/{id}")
    public ResponseEntity<Pacote> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteService.deleteById(id));
    }
}
