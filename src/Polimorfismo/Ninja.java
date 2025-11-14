package Polimorfismo;

public class Ninja extends Personagem {
    @Override
    public String atacar() {
        return "Ninja " + nome + " usa Ragengan";
    }
}
