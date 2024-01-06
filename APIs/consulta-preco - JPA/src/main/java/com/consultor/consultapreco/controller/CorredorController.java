package com.consultor.consultapreco.controller;

import com.consultor.consultapreco.model.Corredor;
import com.consultor.consultapreco.service.CorredorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("corredores")
@CrossOrigin("*")
public class CorredorController {
    @Autowired
    private CorredorService corredorService;

    @GetMapping
    public ResponseEntity<List<Corredor>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(corredorService.findAll());
    }
    @PostMapping
    public ResponseEntity<Corredor> save(@RequestBody Corredor corredor){
        return ResponseEntity.status(HttpStatus.CREATED).body(corredorService.save(corredor));
    }
}
