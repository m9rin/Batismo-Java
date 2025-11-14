package Polimorfismo;

public class Personagem {
    String nome;

    public String atacar() {
        return nome + " atacou";
    }

    public String apresentar() {
        return "Oi eu sou o " + nome;
    }
}
