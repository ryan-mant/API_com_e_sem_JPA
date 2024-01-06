package com.consultor.consultapreco.service;

import com.consultor.consultapreco.model.Corredor;
import com.consultor.consultapreco.repository.CorredorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorredorService {
    @Autowired
    private CorredorRepository corredorRepository;

    public List<Corredor> findAll(){
        return corredorRepository.findAll();
    }
    public Corredor save(Corredor corredor){
        return corredorRepository.save(corredor);
    }
}
