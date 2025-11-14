package NivelIntermediario.Desafio3_1;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String dificuldade;
    private String status;

    public Ninja() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String mostrarInformacoes() {
        return "\n------ Informacoes do Ninja ------" +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nMissao: " + this.missao +
                "\nRank: " + this.dificuldade +
                "\nStatus: " + this.status;
    }
}
