package com.tarefas.multitarefas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    @JsonIgnoreProperties("esta_aberta")
    private boolean estaAberta;
    @NotNull
    private int usoDeMemoriaRamEmMB;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @JsonIgnoreProperties("tarefas")
    private Categoria categoria;

    public Tarefa() {
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

    public boolean isEstaAberta() {
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public int getUsoDeMemoriaRamEmMB() {
        return usoDeMemoriaRamEmMB;
    }

    public void setUsoDeMemoriaRamEmMB(int usoDeMemoriaRamEmMB) {
        this.usoDeMemoriaRamEmMB = usoDeMemoriaRamEmMB;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
