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
    public Musica getById(int id){
        Optional<Musica> musicaRequerida = musicaRepository.findById(id);
        if (musicaRequerida.isPresent()){
            Musica musica = musicaRequerida.get();
            musicaRepository.getById(musica.getId());
            return musica;
        }
        return null;
    }
    public Musica save(Musica musica){
        return musicaRepository.save(musica);
    }
    public Musica putUpdate(Musica musica, int id){
        Optional<Musica> musicaDesatualizada = musicaRepository.findById(id);
        if (musicaDesatualizada.isPresent()){
            Musica musicaAtualizada = musicaDesatualizada.get();
            musicaAtualizada.setId(musica.getId());
            musicaAtualizada.setNome(musica.getNome());
            musicaAtualizada.setDuracaEmSegundos(musica.getDuracaEmSegundos());
            musicaAtualizada.setCompositor(musica.getCompositor());
            musicaAtualizada.setCategoria(musica.getCategoria());
            return musicaRepository.save(musicaAtualizada);
        }
        return null;
    }

    public Musica deleteById(int id){
        Optional<Musica> musicaExcluida = musicaRepository.findById(id);
        if (musicaExcluida.isPresent()){
            Musica musica = musicaExcluida.get();
            musicaRepository.deleteById(musica.getId());
            return musica;
        }
        return null;
    }
}
