package com.consultor.consultapreco.repository;

import com.consultor.consultapreco.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {

    List<Produto> produtos = new ArrayList<>();

    public ProdutoRepository(List<Produto> produtos) {
        this.produtos.add(new Produto(1, "Molho de Tomate Tradicional QUERO 300g", "MOLHO TOM. TRAD. QUERO 300G", "https://static.paodeacucar.com/img/uploads/1/908/24110908.jpg", 1.75, "Corredor Das Massas"));
        this.produtos.add(new Produto(2, "Macarrão Parafuso Adria 500g", "MAC. PARAFUSO ADRIA 500G", "https://static.clubeextra.com.br/img/uploads/1/755/12707755.jpg", 4.25, "Corredor Das Massas"));
        this.produtos.add(new Produto(3, "Nestle Nescau Cereal 270g", "NESCAU CEREAL 270G", "https://araujo.vteximg.com.br/arquivos/ids/3854051-1000-1000/7891000008119_1.jpg?v=636650871283400000", 25.79, "Corredor Dos Cereais"));
        this.produtos.add(new Produto(4, "Doritos Queijo Nacho 84g", "DORITOS Q. NACHO 84G", "https://courier-images-prod.imgix.net/produc_variant/00012163_2dcd53f5-c3a5-4c0a-963d-770d90432a0c.jpg?auto=compress,format&fit=max&w=undefined&h=undefined&dpr=2", 4.99, "Corredor Dos Lanches"));
        this.produtos.add(new Produto(5, "Leite Integral Italac 1L", "LEITE ITALAC INT. 1L", "https://s.cornershopapp.com/product-images/1223865.jpg?versionId=0JBtwU5NHICFjzfSM.FnDeA1_9THxZ8Z", 3.74, "Corredor Dos Laticinios"));
        this.produtos.add(new Produto(6, "Spaten Latinha 350ml", "SPATEN LATA. 350ML", "https://tezeio.vteximg.com.br/arquivos/ids/350564-1000-1000/7891991297424_1_1.png?v=638006279880630000", 3.99, "Corredor Alcólico"));

    }
    public List<Produto> findAll(){
        return produtos;
    }
    public Optional<Produto> findById(int id){
        for (Produto produto :produtos) {
            if (produto.getId() == id){
                return Optional.of(produto);
            }
        }
        return Optional.ofNullable(null);
    }
    public String save(Produto produto){
        for (int i = 0; i < produtos.size(); i++) {
            if (produto.getId() == produtos.get(i).getId() && produto.getCorredor().equals(produtos.get(i).getCorredor())){
                return "Produto" + produto.getNome() + "já consta no banco de dados.";
            }
            else if(produto.getPreco() == 0.00){
                return "Produto não pode ter o preço em 0";
            }
        }
        produtos.add(produto);
        return "Produto " + produto.getNome() + " foi adicionado no banco";
    }
    public Produto update(Produto produto){
        for (int i = 0; i < produtos.size(); i++) {
            if (produto.getId() == produtos.get(i).getId()){
                if (produto.getPreco() == 0){
                    return null;
                }
                produtos.set(i, produto);
                return produtos.get(i);
            }
        }
        return null;
    }
    public String deleteById(int id){
        for (Produto produto :produtos) {
            if (produto.getId() == id){
                produtos.remove(produto);
                return "Produto " + produto.getNome() + " foi removido";
            }
        }
        return null;

    }

}
