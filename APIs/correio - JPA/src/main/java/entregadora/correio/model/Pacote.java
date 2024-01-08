package entregadora.correio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Pacote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String nome;
    @NotNull
    private String nomeDoRecebedor;

    @NotNull
    private String enderecoDoRecebedor;

    @ManyToOne
    @JoinColumn(name = "transporte_id")
    @JsonIgnoreProperties("pacotes")
    private Transporte transporte;

    public Pacote() {
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

    public String getNomeDoRecebedor() {
        return nomeDoRecebedor;
    }

    public void setNomeDoRecebedor(String nomeDoRecebedor) {
        this.nomeDoRecebedor = nomeDoRecebedor;
    }

    public String getEnderecoDoRecebedor() {
        return enderecoDoRecebedor;
    }

    public void setEnderecoDoRecebedor(String enderecoDoRecebedor) {
        this.enderecoDoRecebedor = enderecoDoRecebedor;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}
