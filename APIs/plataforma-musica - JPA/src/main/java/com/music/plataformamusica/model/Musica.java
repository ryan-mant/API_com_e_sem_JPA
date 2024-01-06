package com.music.plataformamusica.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nome;
    @NotNull
    @JsonProperty("duracao_em_segundos")
    private int duracaEmSegundos;
    @NotNull
    private String compositor;

    @ManyToOne
    @JoinColumn(name ="categoria_id")
    @JsonIgnoreProperties("musicas")
    private Categoria categoria;

    public Musica() {
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

    public int getDuracaEmSegundos() {
        return duracaEmSegundos;
    }

    public void setDuracaEmSegundos(int duracaEmSegundos) {
        this.duracaEmSegundos = duracaEmSegundos;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
