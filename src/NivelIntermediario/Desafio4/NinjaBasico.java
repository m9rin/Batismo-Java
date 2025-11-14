package NivelIntermediario.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this(nome, idade, habilidade);
        this.tipoHabilidade = tipoHabilidade;
    }

    public NinjaBasico() {};

    @Override
    public void mostrarInformacoes() {
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo de habilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + ", usou o ataque " + habilidade);
    }
}
