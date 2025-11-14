package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja {
    String habilidade;
    public Uchiha(String nome, int idade, String missao, String dificuldade, String status, String habilidade) {
        super(nome, idade, missao, dificuldade, status);
        this.habilidade = habilidade;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Habilidade: " + habilidade);
    }
}
