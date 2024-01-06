package com.tarefas.multitarefas.repository;

import com.tarefas.multitarefas.model.Tarefa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Repository
public class TarefaRepository {


    List<Tarefa> tarefas = new ArrayList<>();

    public TarefaRepository(List<Tarefa> tarefas){
        this.tarefas.add(new Tarefa(1, "Google Chrome", true, 455,"Navegador de Internet"));
        this.tarefas.add(new Tarefa(2, "Spotify", false, 0,"Aplicativo"));
        this.tarefas.add(new Tarefa(3, "Anti-Virus", true, 647,"Recursos do Sistema"));
        this.tarefas.add(new Tarefa(4, "Discord", true, 285,"Aplicativo"));
        this.tarefas.add(new Tarefa(5,  "Opera GX", false, 0,"Navegador de Internet"));
        this.tarefas.add(new Tarefa(6, "Atualização do Sistema", false, 0,"Recursos do Sistema"));
    }

    public List<Tarefa> findAll(){
        return tarefas;
    }
    public Optional<Tarefa> findById(int id){
        for (Tarefa tarefa :tarefas) {
            if (tarefa.getId() == id){
                return Optional.of(tarefa);
            }
        }
        return Optional.ofNullable(null);
    }
    public String save(Tarefa tarefa){
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefa.getId() == tarefas.get(i).getId() && tarefa.getNome().equals(tarefas.get(i).getNome())){
                if (tarefas.get(i).isEstaAberta() == true){
                    tarefas.get(i).setUsoDeMemoriaRamEmMB(tarefas.get(i).getUsoDeMemoriaRamEmMB()*2);
                    return "Tarefa " + tarefa.getNome() + " já estava aberta e agora esta usando " + tarefas.get(i).getUsoDeMemoriaRamEmMB() + " MB de ram";
                }
                else if(tarefas.get(i).isEstaAberta() == false) {
                    tarefas.get(i).setEstaAberta(true);
                    Random random = new Random();
                    int value = random.nextInt(900 + 200);
                    tarefas.get(i).setUsoDeMemoriaRamEmMB(value);
                    return "Tarefa " + tarefa.getNome() + " foi aberta e está consulmindo " + tarefas.get(i).getUsoDeMemoriaRamEmMB() + " MB de ram";
                }
            }
        }
        tarefas.add(tarefa);
        return "Tarefa " + tarefa.getNome() + " foi adicionada";
    }

    public Tarefa update(Tarefa tarefa){
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefa.getId() == tarefas.get(i).getId()){
                if (tarefa.isEstaAberta() == false){
                    tarefas.get(i).setUsoDeMemoriaRamEmMB(0);
                }
                else if(tarefa.isEstaAberta() == true){
                    Random random = new Random();
                    int value = random.nextInt(900 + 200);
                    tarefa.setUsoDeMemoriaRamEmMB(value);
                }
                tarefas.set(i, tarefa);
                return tarefas.get(i);
            }
        }
        return null;
    }
    public String updateEstaAberta(int id){
        for (int i = 0; i < tarefas.size(); i++) {
            if (id == tarefas.get(i).getId()){
                tarefas.get(i).setEstaAberta(!tarefas.get(i).isEstaAberta());
                if (tarefas.get(i).isEstaAberta() == false){
                    tarefas.get(i).setUsoDeMemoriaRamEmMB(0);
                }
                else if(tarefas.get(i).isEstaAberta() == true){
                    Random random = new Random();
                    int value = random.nextInt(900 + 200);
                    tarefas.get(i).setUsoDeMemoriaRamEmMB(value);
                }
                return "Tarefa " + tarefas.get(i).getNome() + " foi atualizada para " + tarefas.get(i).isEstaAberta();
            }
        }
        return null;
    }
    public Tarefa deleteById(int id){
        Optional<Tarefa> OptionalMusica = findById(id);
        if (OptionalMusica.isPresent()){
            Tarefa tarefa = OptionalMusica.get();
            tarefas.remove(tarefa);
            return tarefa;
        }
        System.out.println("Tarefa não encontrada");
        return null;
    }
}
