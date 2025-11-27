package NivelIntermediario.Desafio6;

public class Ninja {
    String nome;
    int idade;
    String vila;

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public Ninja() {}

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                " Idade: " + this.idade +
                " Vila: " + this.vila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }
}
