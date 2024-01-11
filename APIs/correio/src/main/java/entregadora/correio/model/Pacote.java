package entregadora.correio.model;

public class Pacote {
    private int id;
    private String nome;;
    private String nomeDoRecebedor;
    private String enderecoDoRecebedor;
    private String transporte;

    public Pacote() {
    }

    public Pacote(int id, String nome, String nomeDoRecebedor, String enderecoDoRecebedor, String transporte) {
        this.id = id;
        this.nome = nome;
        this.nomeDoRecebedor = nomeDoRecebedor;
        this.enderecoDoRecebedor = enderecoDoRecebedor;
        this.transporte = transporte;
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

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
}
