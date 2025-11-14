package Polimorfismo;

public class Pirata extends Personagem {
    @Override
    public String atacar() {
        return "Pirata " + nome + " usa Gomu Gomu no Pistol";
    }
}
