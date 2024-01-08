package entregadora.correio.service;

import entregadora.correio.model.Pacote;
import entregadora.correio.model.Transporte;
import entregadora.correio.repository.TransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransporteService {
    @Autowired
    private TransporteRepository transporteRepository;

    public List<Transporte> findAll(){
        return transporteRepository.findAll();
    }
    public Optional<Transporte> findById(int id){
        Optional<Transporte> transporteEncontrado = transporteRepository.findById(id);
        if (transporteEncontrado.isPresent()){
            return transporteEncontrado;
        }
        return Optional.ofNullable(null);
    }
    public Transporte save(Transporte transporte){
        for (Transporte transporteNoBanco :transporteRepository.findAll()) {
            if (transporte.getNome().equalsIgnoreCase(transporteNoBanco.getNome())){
                throw new RuntimeException("Transporte ja exite com o nome de: " + transporteNoBanco.getNome());
            }
        }
        return transporteRepository.save(transporte);
    }
    public Transporte update(Transporte transporte){
        for (Transporte transporteNoBanco : transporteRepository.findAll()) {
            if (transporte.getId() == transporteNoBanco.getId()){
                transporteNoBanco.setId(transporte.getId());
                transporteNoBanco.setNome(transporte.getNome());
                transporteNoBanco.setPacotes(transporte.getPacotes());
                return transporteRepository.save(transporte);
            }
        }
        return null;
    }
    public Transporte deleteById(int id){
        Optional<Transporte> transporteDeletado = transporteRepository.findById(id);
        if (transporteDeletado.isPresent()){
            Transporte transporte = transporteDeletado.get();
            transporteRepository.deleteById(transporte.getId());
            return transporte;
        }
        return null;
    }
}
