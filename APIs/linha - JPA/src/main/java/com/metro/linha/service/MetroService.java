package com.metro.linha.service;

import com.metro.linha.model.Metro;
import com.metro.linha.repository.MetroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetroService {
    @Autowired
    private MetroRepository metroRepository;

    public List<Metro> findAll(){
        return metroRepository.findAll();
    }
    public Optional<Metro> findById(int id){
        Optional<Metro> metroEncontrado = metroRepository.findById(id);
        if (metroEncontrado.isPresent()){
            return metroEncontrado;
        }
        throw new RuntimeException("Metro não encontrado!");
    }
    public Metro save(Metro metro){
        for (Metro metroNoBanco : metroRepository.findAll()) {
            if (metroNoBanco.getId() == metro.getId()){
                throw new RuntimeException("Metro já consta no banco!");
            }
        }
        return metroRepository.save(metro);
    }
    public Metro update(Metro metro){
        for (Metro metroNoBanco : metroRepository.findAll()) {
            if (metroNoBanco.getId() == metro.getId()){
                metroNoBanco.setEstacaoDeInicio(metro.getEstacaoDeInicio());
                metroNoBanco.setUltimaEstacao(metro.getUltimaEstacao());
                metroNoBanco.setLinha(metro.getLinha());
                metroRepository.save(metro);
                return metroNoBanco;
            }
        }
        throw new RuntimeException("Metro não encontrado");
    }
    public Metro deleteById(int id){
        Optional<Metro> metroDeletado = metroRepository.findById(id);
        if (metroDeletado.isPresent()){
            Metro metro = metroDeletado.get();
            metroRepository.deleteById(metro.getId());
            return metro;
        }
        throw new RuntimeException("Metro não encontrado");
    }
}
