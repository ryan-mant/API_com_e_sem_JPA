package com.music.plataformamusica.repository;

import com.music.plataformamusica.model.Musica;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MusicaRepository {

    List<Musica> musicas = new ArrayList<>();

    public MusicaRepository(List<Musica> musicas) {
        this.musicas.add(new Musica(1, "Seu Astral", 179, "Jorge e Mateus", "Sertanejo"));
        this.musicas.add(new Musica(2, "Mina do Condominio", 170, "Seu Jorge", "Samba"));
        this.musicas.add(new Musica(3, "Até que Durou", 210, "Péricles", "Pagode"));
        this.musicas.add(new Musica(4, "Dengo", 153, "João Gomes", "Sertanejo"));
        this.musicas.add(new Musica(5, "Nunca vai ser eu", 146, "Barões da Pisadinha", "Forró"));
        this.musicas.add(new Musica(6, "Camisa 10", 207, "Turma do Pagode", "Pagode"));
        this.musicas.add(new Musica(7, "Ta Vendo Aquela Lua", 218, "Exaltasamba", "Pagode"));
    }

    public List<Musica> findAll(){
        return this.musicas;
    }
    public String save(Musica musica){
        for (Musica musica1 : musicas) {
            if (musica.getId() == musica1.getId()){
                return "musica existente";
            }
        }
        musicas.add(musica);
        return "musica " + musica.getNome() + " adicionada";
    }

    public Optional<Musica> getById(int id){
        for (Musica musica :musicas) {
            if (musica.getId() == id){
                return Optional.of(musica);
            }
        }
        return Optional.ofNullable(null);
    }
    public Musica update(Musica musica){
        for (int i = 0; i < musicas.size(); i++) {
            if (musica.getId() == musicas.get(i).getId()){
                musicas.set(i, musica);
                return musica;
            }
        }

        return null;
    }
    public Musica deleteById(int id){
        Optional<Musica> optionalMusica = getById(id);
        if (optionalMusica.isPresent()){
            Musica musica = optionalMusica.get();
            musicas.remove(musica);
            return musica;
        }
        return null;
    }
}
