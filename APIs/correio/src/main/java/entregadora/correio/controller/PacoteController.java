package entregadora.correio.controller;

import entregadora.correio.model.Pacote;
import entregadora.correio.repository.PacoteRepository;
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
    private PacoteRepository pacoteRepository;

    @GetMapping
    public ResponseEntity<List<Pacote>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pacote>> findById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<Pacote> save(@RequestBody Pacote pacote){
        return ResponseEntity.status(HttpStatus.CREATED).body(pacoteRepository.save(pacote));
    }
    @PutMapping
    public ResponseEntity<Pacote> update(@RequestBody Pacote pacote){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteRepository.update(pacote));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Pacote>> deleteById(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(pacoteRepository.deleteById(id));
    }
}
