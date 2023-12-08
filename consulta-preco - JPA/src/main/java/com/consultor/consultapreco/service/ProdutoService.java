package com.consultor.consultapreco.service;

import com.consultor.consultapreco.model.Produto;
import com.consultor.consultapreco.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAll(){
        return produtoRepository.findAll();
    }
    public Produto save(Produto produto){
        if (produto.getPreco() == 0.00){
            return null;
        }
        for (int i = 0; i < produtoRepository.findAll().size(); i++) {
            if (produto.getNome().equals(produtoRepository.findAll().get(i).getNome()) && produto.getPreco() ==
            produtoRepository.findAll().get(i).getPreco()){
                System.out.println("Produto " + produto.getNome() + " já está presente no banco de dados.");
                return null;
            }
        }
        System.out.println("Produto " + produto.getNome() + " foi adicionado");
        return produtoRepository.save(produto);
    }
    public Produto getById(int id){
        Optional<Produto> produtoEncontrado = produtoRepository.findById(id);
        if (produtoEncontrado.isPresent()){
            Produto produto = produtoEncontrado.get();
            return produto;
        }
        System.out.println("Produto não encontrado");
        return null;
    }
    public Produto update(Produto produto){
        if (produto.getPreco() == 0){
            return null;
        }
        Optional<Produto> produtoDesatualizado = produtoRepository.findById(produto.getId());
        if (produtoDesatualizado.isPresent()){
            produtoDesatualizado.get().setId(produto.getId());
            produtoDesatualizado.get().setNome(produto.getNome());
            produtoDesatualizado.get().setNomeSimples(produto.getNomeSimples());
            produtoDesatualizado.get().setImg(produto.getImg());
            produtoDesatualizado.get().setCorredor(produto.getCorredor());
            produtoDesatualizado.get().setPreco(produto.getPreco());
            return produtoRepository.save(produto);
        }
        return null;
    }
    public Produto deleteById(int id){
        Optional<Produto> produtoExcluido = produtoRepository.findById(id);
        if (produtoExcluido.isPresent()){
            Produto produto = produtoExcluido.get();
            produtoRepository.deleteById(produto.getId());
            return produto;
        }
        return null;
    }
}
