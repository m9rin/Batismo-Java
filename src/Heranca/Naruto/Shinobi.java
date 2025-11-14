package Heranca.Naruto;

public class Shinobi {
    private String nome;
    private String vila;

    public Shinobi(String nome, String vila) {
        this.nome = nome;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public String getVila() {
        return vila;
    }

    public String descricao() {
        return "Shinobi: " + nome + " Vila: " + vila;
    }

    public String gritarTecnica() {
        return "Sem técnica cadastrada!";
    }
}
