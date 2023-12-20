package com.academia.atletas.service;

import com.academia.atletas.model.Atleta;
import com.academia.atletas.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AtletaService {
    @Autowired
    private AtletaRepository atletaRepository;

    public List<Atleta> findAll(){
        return atletaRepository.findAll();
    }
    public Optional<Atleta> findById(int id){
        Optional<Atleta> atletaEncontrado = atletaRepository.findById(id);
        if (atletaEncontrado.isPresent()){
            return atletaEncontrado;
        }
        return Optional.ofNullable(null);
    }
    public Atleta save(Atleta atleta){
        for (Atleta atletaNoBanco :atletaRepository.findAll()) {
            if (atleta.getId() == atletaNoBanco.getId()){
                System.out.println("Já existe um atleta com esse id no banco de dados!");
                return null;
            }
        }
        if (atleta.getDataAssinatura() == null && atleta.getDataDeVencimento() == null) {
            atleta.setDataAssinatura(LocalDate.now());
            atleta.setDataDeVencimento(atleta.getDataAssinatura().plusMonths(1));
        } else if (atleta.getDataAssinatura() == null) {
            atleta.setDataAssinatura(LocalDate.now());
        } else if (atleta.getDataDeVencimento() == null) {
            atleta.setDataDeVencimento(atleta.getDataAssinatura().plusMonths(1));
        }
        return atletaRepository.save(atleta);
    }
    public Atleta update(Atleta atleta){
        for (Atleta atletaNoBanco :atletaRepository.findAll()) {
            if (atleta.getId() == atletaNoBanco.getId()){
                if (atleta.getDataAssinatura() == null && atleta.getDataDeVencimento() == null) {
                    atleta.setDataAssinatura(LocalDate.now());
                    atleta.setDataDeVencimento(atleta.getDataAssinatura().plusMonths(1));
                } else if (atleta.getDataAssinatura() == null) {
                    atleta.setDataAssinatura(LocalDate.now());
                } else if (atleta.getDataDeVencimento() == null) {
                    atleta.setDataDeVencimento(atleta.getDataAssinatura().plusMonths(1));
                }
                atletaNoBanco.setId(atleta.getId());
                atletaNoBanco.setNome(atleta.getNome());
                atletaNoBanco.setProfessor(atleta.getProfessor());
                atletaNoBanco.setDataAssinatura(atleta.getDataAssinatura());
                atletaNoBanco.setDataDeVencimento(atleta.getDataDeVencimento());
                return atletaRepository.save(atleta);
            }
        }
        return null;
    }
    public Atleta updateDataDeAssinatura(int id){
        Optional<Atleta> atletaEncontrado = atletaRepository.findById(id);
        if (atletaEncontrado.isPresent()){
            atletaEncontrado.get().setDataAssinatura(LocalDate.now());
            atletaEncontrado.get().setDataDeVencimento(LocalDate.now().plusMonths(1));
            return atletaRepository.save(atletaEncontrado.get());
        }
        return null;
    }
    public Atleta deleteById(int id){
        Optional<Atleta> atletaEncontrado = atletaRepository.findById(id);
        if (atletaEncontrado.isPresent()){
            Atleta atleta = atletaEncontrado.get();
            atletaRepository.deleteById(atleta.getId());
            return atleta;
        }
        return null;
    }
}
