package com.metro.linha.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Linha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String nome;

    @OneToMany(mappedBy = "linha")
    @JsonIgnoreProperties("linha")
    private List<Metro> metros;

    public Linha() {
    }

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

    public List<Metro> getMetros() {
        return metros;
    }

    public void setMetros(List<Metro> metros) {
        this.metros = metros;
    }
}
