package NivelIntermediario.Desafio3;

public class Main {
    public static void main(String[] args) {
        Ninja kakashi = new Ninja("Kakashi", 26, "Escolta de Tazuna", "C", "Em andamento");
        kakashi.informacoes();

        Ninja sasuke = new Uchiha("Sasuke", 14, "Escolta de Tazuna", "C", "Em andamento", "Sharingan");
        sasuke.informacoes();
    }
}
