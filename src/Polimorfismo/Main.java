package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Personagem naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";

        Personagem luffy = new Pirata();
        luffy.nome = "Monkey D. Luffy";

        naruto.apresentar();
        naruto.atacar();
        luffy.apresentar();
        luffy.atacar();
    }
}
