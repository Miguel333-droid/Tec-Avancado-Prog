package Model;

public class Cliente {
    private String nome;
    private String fone;
    private int id;

    public Cliente(int id, String nome, String fone) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String toString() {
        return "[ID: " + id + "] [Nome: " + nome + "] [Fone: " + fone + "]";
    }
}
