package com.music.plataformamusica.model;


public class Musica {
    private int id;
    private String nome;
    private int duracaoEmSegundos;
    private String compositor;
    private String categoria;

    public Musica() {
    }

    public Musica(int id, String nome, int duracaoEmSegundos, String compositor, String categoria) {
        this.id = id;
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.compositor = compositor;
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

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
