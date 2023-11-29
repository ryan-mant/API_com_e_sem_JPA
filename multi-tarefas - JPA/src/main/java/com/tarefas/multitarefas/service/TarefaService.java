package com.tarefas.multitarefas.service;

import com.tarefas.multitarefas.model.Tarefa;
import com.tarefas.multitarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;


    public List<Tarefa> getAll(){
        return tarefaRepository.findAll();
    }
    public Tarefa getById(int id){
        Optional<Tarefa> optionalTarefa = tarefaRepository.findById(id);
        if (optionalTarefa.isPresent()){
            Tarefa tarefaEncontrada = optionalTarefa.get();
            return tarefaEncontrada;
        }
        return null;
    }
    public Tarefa save(Tarefa tarefa) {
        for (int i = 0; i < tarefaRepository.findAll().size(); i++) {
            if (tarefa.getId() == tarefaRepository.findAll().get(i).getId() && tarefa.getNome() == tarefaRepository
                    .findAll().get(i).getNome()){
                if (tarefaRepository.findAll().get(i).isEstaAberta() == true){
                    tarefaRepository.findAll().get(i).setUsoDeMemoriaRamEmMB(tarefaRepository.findAll().get(i).getUsoDeMemoriaRamEmMB() * 2);
                    System.out.println("A tarefa " + tarefa.getNome() + " ja estáva aberta e agora está consulmindo " + tarefaRepository.findAll()
                            .get(i).getUsoDeMemoriaRamEmMB() + " MB de ram");
                    return tarefaRepository.findAll().get(i);
                }
                else if(tarefaRepository.findAll().get(i).isEstaAberta() == false){
                    tarefaRepository.findAll().get(i).setEstaAberta(true);
                    Random random = new Random();
                    int value = random.nextInt(800 + 200);
                    tarefaRepository.findAll().get(i).setUsoDeMemoriaRamEmMB(value);
                    System.out.println("A tarefa " + tarefa.getNome() + " que estáva fechada, agora está aberta consulmindo " +
                            tarefaRepository.findAll().get(i).getUsoDeMemoriaRamEmMB() + " MB de ram");
                    return tarefaRepository.findAll().get(i);
                }
            }
        }
        System.out.println("Tarefa " + tarefa.getNome() + " adicionada");
        return tarefaRepository.save(tarefa);
    }

    public Tarefa update(Tarefa tarefa){
        for (int i = 0; i < tarefaRepository.findAll().size(); i++) {
            if (tarefa.getId() == tarefaRepository.findAll().get(i).getId()){
                if (tarefa.isEstaAberta() == false){
                    tarefa.setUsoDeMemoriaRamEmMB(0);
                }
                else if(tarefa.isEstaAberta() == true){
                    Random random = new Random();
                    int value = random.nextInt(900 + 200);
                    tarefa.setUsoDeMemoriaRamEmMB(value);
                }
                Optional<Tarefa> tarefaAtualizada = tarefaRepository.findById(tarefa.getId());
                tarefaAtualizada.get().setId(tarefa.getId());
                tarefaAtualizada.get().setNome(tarefa.getNome());
                tarefaAtualizada.get().setEstaAberta(tarefa.isEstaAberta());
                tarefaAtualizada.get().setUsoDeMemoriaRamEmMB(tarefa.getUsoDeMemoriaRamEmMB());
                tarefaAtualizada.get().setCategoria(tarefa.getCategoria());
                return tarefaRepository.save(tarefa);
            }
        }
        return null;
    }

    public Tarefa updateEstaAberta(int id){
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        if (tarefa.isPresent()){
            tarefa.get().setEstaAberta(!tarefa.get().isEstaAberta());
            if (tarefa.get().isEstaAberta() == false){
                tarefa.get().setUsoDeMemoriaRamEmMB(0);
            }
            else if(tarefa.get().isEstaAberta() == true){
                Random random = new Random();
                int value = random.nextInt(800 + 200);
                tarefa.get().setUsoDeMemoriaRamEmMB(value);
            }
            return tarefaRepository.save(tarefa.get());
        }
        return null;
    }
    public Tarefa deleteById(int id){
        Optional<Tarefa> tarefaExcluida = tarefaRepository.findById(id);
        if (tarefaExcluida.isPresent()){
            Tarefa tarefa = tarefaExcluida.get();
            tarefaRepository.deleteById(tarefa.getId());
            return tarefa;
        }
        return null;
    }
}
