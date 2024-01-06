package com.consultor.consultapreco.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Produto {
    private int id;
    private String nome;
    private String nomeSimples;
    private String img;
    private double preco;
    private String corredor;

    public Produto() {
    }

    public Produto(int id, String nome, String nomeSimples, String img, double preco, String corredor) {
        this.id = id;
        this.nome = nome;
        this.nomeSimples = nomeSimples;
        this.img = img;
        this.preco = preco;
        this.corredor = corredor;
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

    public String getNomeSimples() {
        return nomeSimples;
    }

    public void setNomeSimples(String nomeSimples) {
        this.nomeSimples = nomeSimples;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }
}
