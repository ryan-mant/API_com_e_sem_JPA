package com.tarefas.multitarefas.model;


public class Tarefa {
    private int id;
    private String nome;
    private  boolean estaAberta;
    private int usoDeMemoriaRamEmMB;
    private String categoria;

    public Tarefa() {
    }

    public Tarefa(int id, String nome, boolean estaAberta, int usoDeMemoriaRamEmMB, String categoria) {
        this.id = id;
        this.nome = nome;
        this.estaAberta = estaAberta;
        this.usoDeMemoriaRamEmMB = usoDeMemoriaRamEmMB;
        this.categoria = categoria;
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

    public void setUsoDeMemoriaRamEmMB(int usoDeMemóriaRamEmMB) {
        this.usoDeMemoriaRamEmMB = usoDeMemóriaRamEmMB;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
