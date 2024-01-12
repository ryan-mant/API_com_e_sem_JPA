package com.metro.linha.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Metro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String ultimaEstacao;

    @NotNull
    private String estacaoDeInicio;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "linha_id")
    @JsonIgnoreProperties("metros")
    private Linha linha;

    public Metro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUltimaEstacao() {
        return ultimaEstacao;
    }

    public void setUltimaEstacao(String ultimaEstacao) {
        this.ultimaEstacao = ultimaEstacao;
    }

    public String getEstacaoDeInicio() {
        return estacaoDeInicio;
    }

    public void setEstacaoDeInicio(String estacaoDeInicio) {
        this.estacaoDeInicio = estacaoDeInicio;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }
}
