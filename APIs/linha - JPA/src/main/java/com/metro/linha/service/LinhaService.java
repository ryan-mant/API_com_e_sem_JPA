package com.metro.linha.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.metro.linha.model.Linha;
import com.metro.linha.repository.LinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinhaService {
    @Autowired
    private LinhaRepository linhaRepository;

    public List<Linha> findAll(){
        return linhaRepository.findAll();
    }
    public Optional<Linha> findById(int id){
        Optional<Linha> linhaEncontrada = linhaRepository.findById(id);
        if (linhaEncontrada.isPresent()){
            return linhaEncontrada;
        }
        throw new RuntimeException("Linha não encontrada");
    }
    public Linha save(Linha linha){
        for (Linha linhaNoBanco : linhaRepository.findAll()) {
            if (linha.getId() == linhaNoBanco.getId()){
                throw new RuntimeException("Linha já existe no banco!");
            }
        }
        return linhaRepository.save(linha);
    }
    public Linha update(Linha linha){
        for (Linha linhaNoBanco :linhaRepository.findAll()) {
            if (linhaNoBanco.getId() == linha.getId()){
                linhaNoBanco.setMetros(linha.getMetros());
                linhaNoBanco.setNome(linha.getNome());
                linhaRepository.save(linha);
                return linhaNoBanco;
            }
        }
        throw new RuntimeException("Linha não encontrada");
    }
    public Linha deleteById(int id){
        Optional<Linha> linhaDeletada = linhaRepository.findById(id);
        if (linhaDeletada.isPresent()){
            Linha linha = linhaDeletada.get();
            linhaRepository.deleteById(linha.getId());
            return linha;
        }
        throw new RuntimeException("Linha não encontrada");
    }

}
