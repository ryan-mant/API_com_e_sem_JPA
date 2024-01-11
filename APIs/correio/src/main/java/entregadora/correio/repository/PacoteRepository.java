package entregadora.correio.repository;

import entregadora.correio.model.Pacote;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PacoteRepository {

    List<Pacote> pacotes = new ArrayList<>();

    public PacoteRepository(List<Pacote> pacotes) {
        this.pacotes.add(new Pacote(1, "Mouse Gamer Atack Shark", "Igor Oliveira", "Rua Mario Santos Figueira, 452","Transporte Aéreo"));
        this.pacotes.add(new Pacote(2, "Kit Upgrade Ryzen 5 5500 + A52Om Biostar", "Julia Vieira", "Rua Constelação de Jade, apto. 83", "Transporte Terrestre"));;
        this.pacotes.add(new Pacote(3, "Kit 60 cores Leo", "João Brito", "Avenida Lucas de Sena, 675 casa 2","Transporte Naval"));
        this.pacotes.add(new Pacote(4, "Vestido Azul tamanho: P", "Paola Neves", "Codominio Praia Ruby, 5", "Transporte Por Moto"));
    }
    public List<Pacote> findAll(){
        return pacotes;
    }
    public Optional<Pacote> findById(int id){
        for (Pacote pacote :pacotes) {
            if (pacote.getId() == id){
                return Optional.of(pacote);
            }
        }
        return Optional.ofNullable(null);
    }
    public Pacote save(Pacote pacote){
        for (Pacote pacoteNoBanco :pacotes) {
            if (pacoteNoBanco.getId() == pacote.getId()){
                throw new RuntimeException("Pacote existente");
            }
        }
        if (pacote.getId() == 0){
            throw new RuntimeException("Pacote sem id");
        } else if (pacote.getNomeDoRecebedor().equals(null) || pacote.getEnderecoDoRecebedor().equals(null)) {
            throw new RuntimeException("Pacote sem recebedor/endereço");
        }
        pacotes.add(pacote);
        return pacote;
    }
    public Pacote update(Pacote pacote){
        for (int i = 0; i < pacotes.size(); i++) {
            if (pacotes.get(i).getId() == pacote.getId()){
                if (pacote.getNomeDoRecebedor().equals(null) || pacote.getEnderecoDoRecebedor().equals(null)) {
                    throw new RuntimeException("Pacote não pode ser inserido sem nome do recebedor ou sem endereço!");
                }
                pacotes.set(i, pacote);
                return pacotes.get(i);
            }
        }
        throw new RuntimeException("Pacote não encontrado");
    }
    public Optional<Pacote> deleteById(int id){
        Optional<Pacote> pacoteDeletado = findById(id);
        if (pacoteDeletado.isPresent()){
            Pacote pacote = pacoteDeletado.get();
            pacotes.remove(pacote);
            return pacoteDeletado;
        }
        throw new RuntimeException("Pacote não encontrado!");
    }
}
