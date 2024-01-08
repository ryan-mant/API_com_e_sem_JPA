package entregadora.correio.service;

import entregadora.correio.model.Pacote;
import entregadora.correio.repository.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository pacoteRepository;

    public List<Pacote> findAll(){
        return pacoteRepository.findAll();
    }
    public Optional<Pacote> findById(int id){
        Optional<Pacote> pacoteEncontrado = pacoteRepository.findById(id);
        if (pacoteEncontrado.isPresent()){
            return pacoteEncontrado;
        }
        return Optional.ofNullable(null);
    }
    public Pacote save(Pacote pacote){
        for (Pacote pacoteDoBanco : pacoteRepository.findAll()) {
            if (pacoteDoBanco.getId() == pacote.getId()){
                System.out.println("Id " + pacote.getId() + " ja consta no banco com o nome de: " + pacoteDoBanco.getNome());
                throw new RuntimeException("Pacote já registado");
            }
        }
        return pacoteRepository.save(pacote);
    }
    public Pacote update(Pacote pacote){
        for (Pacote pacoteDoBanco : pacoteRepository.findAll()) {
            if (pacoteDoBanco.getId() == pacote.getId()){
                pacoteDoBanco.setId(pacote.getId());
                pacoteDoBanco.setNome(pacote.getNome());
                pacoteDoBanco.setNomeDoRecebedor(pacote.getNomeDoRecebedor());
                pacoteDoBanco.setEnderecoDoRecebedor(pacote.getEnderecoDoRecebedor());
                pacoteDoBanco.setTransporte(pacote.getTransporte());
                System.out.println("Pacote Atualizado!!");
                return pacoteRepository.save(pacote);
            }
        }
        throw new RuntimeException("Pacote não encontrado");
    }
    public Pacote deleteById(int id){
        Optional<Pacote> pacoteDeletado = pacoteRepository.findById(id);
        if (pacoteDeletado.isPresent()){
            Pacote pacote = pacoteDeletado.get();
            pacoteRepository.deleteById(pacote.getId());
            return pacote;
        }
        return null;
    }
}
