package Heranca.DemonSlayer;

public class Cacador {
    private String nome;
    private String respiracao;

    public Cacador(String nome, String respiracao) {
        this.nome = nome;
        this.respiracao = respiracao;
    }

    public String getNome() {
        return nome;
    }

    public String getRespiracao() {
        return respiracao;
    }

    public String descricao() {
        return "Caçador: " + nome + " | Respiração: " + respiracao;
    }
}
