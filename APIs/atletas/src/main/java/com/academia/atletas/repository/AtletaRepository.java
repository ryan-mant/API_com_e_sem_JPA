package com.academia.atletas.repository;

import com.academia.atletas.model.Atleta;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AtletaRepository {

    List<Atleta> atletas = new ArrayList<>();
    public AtletaRepository(List<Atleta> atletas) {
        this.atletas.add(new Atleta(1, "Pedro", "2023-06-04", "2023-07-04","Rodrigo"));
        this.atletas.add(new Atleta(2, "Cassandra", "2022-09-25","2022-10-25","Maria"));
        this.atletas.add(new Atleta(3, "Lucas", "2023-11-18","2023-12-18","Maria"));
        this.atletas.add(new Atleta(4, "Vanessa", "2023-04-22","2023-05-22","Marcos"));
    }

    public List<Atleta> findAll(){
        return atletas;
    }
    public Optional<Atleta> findById(int id){
        for (Atleta atleta :atletas) {
            if (atleta.getId() == id){
            return Optional.of(atleta);
            }
        }
        return Optional.ofNullable(null);
    }
    public String save(Atleta atleta){
        for (int i = 0; i < atletas.size(); i++) {
            if (atleta.getId() == atletas.get(i).getId()){
                return "Erro. Id " + atleta.getId() + " corresponde ao atleta: " + atletas.get(i).getNome();
            }
        }
        if (atleta.getDataDeAssinatura() == null) {
            atleta.setDataDeAssinatura(LocalDate.now());
        }
        else if(atleta.getDataDeVencimento() == null){
            atleta.setDataDeVencimento(LocalDate.parse(atleta.getDataDeAssinatura().toString()).plusMonths(1));
        }
        atletas.add(atleta);
        return "Atleta " + atleta.getNome() + " foi adicionado";
    }

    public Atleta update(Atleta atleta){
        for (int i = 0; i < atletas.size(); i++) {
            if (atleta.getId() == atletas.get(i).getId()){
                if (atleta.getNome().equals(null)){
                    return null;
                }else if (atleta.getDataDeAssinatura() == null && atleta.getDataDeVencimento() == null) {
                    atleta.setDataDeAssinatura(LocalDate.now());
                    atleta.setDataDeVencimento(atleta.getDataDeAssinatura().plusMonths(1));
                } else if (atleta.getDataDeAssinatura() == null) {
                    atleta.setDataDeAssinatura(LocalDate.now());
                } else if (atleta.getDataDeVencimento() == null) {
                    atleta.setDataDeVencimento(atleta.getDataDeAssinatura().plusMonths(1));
                }
                atletas.set(i, atleta);
                return atletas.get(i);
            }
        }
        return null;
    }
    public Atleta updateDataAssinatura(int id){
        for (Atleta atleta :atletas) {
            if (atleta.getId() == id){
                atleta.setDataDeAssinatura(LocalDate.now());
                atleta.setDataDeVencimento(LocalDate.now().plusMonths(1));
                System.out.println("Atleta atualizado!");
                return atleta;
            }
        }
        System.out.println("Atleta não encontrado.");
        return null;
    }
    public Optional<Atleta> deleteById(int id){
        Optional<Atleta> atletaDeletado = findById(id);
        if (atletaDeletado.isPresent()){
            System.out.println("Atleta " + atletaDeletado.get().getNome() + " foi deletado!");
            Atleta atleta = atletaDeletado.get();
            atletas.remove(atleta);
            return atletaDeletado;
        }
        System.out.println("Atleta  não encontrado.");
        return Optional.ofNullable(null);
    }
}
