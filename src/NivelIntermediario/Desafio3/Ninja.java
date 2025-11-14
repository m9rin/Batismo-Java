package NivelIntermediario.Desafio3;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String dificuldade;
    private String status;

    public Ninja(String nome, int idade, String missao, String dificuldade, String status) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.dificuldade = dificuldade;
        this.status = status;
    }

    public void informacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Dificuldade: " + dificuldade);
        System.out.println("Status: " + status);
    }
}
