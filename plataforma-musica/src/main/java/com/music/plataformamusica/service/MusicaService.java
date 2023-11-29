package com.music.plataformamusica.service;

import com.music.plataformamusica.model.Musica;
import com.music.plataformamusica.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository musicaRepository;

    public List<Musica> getAll(){
        return musicaRepository.findAll();
    }
    public String save(Musica musica){
        return musicaRepository.save(musica);
    }
    public Optional<Musica> getById(int id){
        return musicaRepository.getById(id);
    }
    public Musica put(Musica musica){
        return musicaRepository.update(musica);
    }
    public Musica delete(int id){
        return musicaRepository.deleteById(id);
    }
}
