package com.academia.atletas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nome;
    @OneToMany(mappedBy = "professor")
    @JsonIgnoreProperties("professor")
    private List<Atleta> alunos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atleta> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Atleta> alunos) {
        this.alunos = alunos;
    }
}
