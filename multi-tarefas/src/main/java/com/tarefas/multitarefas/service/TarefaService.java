package com.tarefas.multitarefas.service;

import com.tarefas.multitarefas.model.Tarefa;
import com.tarefas.multitarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> getAll(){
        return tarefaRepository.findAll();
    }
    public Optional<Tarefa> getById(int id){
        return tarefaRepository.findById(id);
    }
    public String save(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }
    public Tarefa put(Tarefa tarefa){
        return tarefaRepository.update(tarefa);
    }
    public String putEstaAbertaById(int id){
        return tarefaRepository.updateEstaAberta(id);
    }
    public Tarefa deleteById(int id){
        return tarefaRepository.deleteById(id);
    }
}
