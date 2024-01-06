package com.academia.atletas.model;

import java.time.LocalDate;

public class Atleta {
    private int id;
    private String nome;
    private LocalDate dataDeAssinatura;
    private LocalDate dataDeVencimento;
    private String professor;

    public Atleta() {
    }

    public Atleta(int id, String nome, String dataDeAssinatura, String dataDeVencimento, String professor) {
        this.id = id;
        this.nome = nome;
        this.dataDeAssinatura = LocalDate.parse(dataDeAssinatura);
        this.dataDeVencimento = LocalDate.parse(dataDeVencimento);
        this.professor = professor;
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

    public LocalDate getDataDeAssinatura() {
        return dataDeAssinatura;
    }

    public void setDataDeAssinatura(LocalDate dataDeAssinatura) {
        this.dataDeAssinatura = dataDeAssinatura;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
