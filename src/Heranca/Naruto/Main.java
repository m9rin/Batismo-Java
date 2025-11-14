package Heranca.Naruto;

public class Main {
    public static void main(String[] args) {
        Genin naruto = new Genin("Naruto Uzumaki", "Folha", "Kakashi Hatake");
        Jounin kakashi = new Jounin("Kakashi Hatake", "Folha", 45);

        System.out.println(naruto.descricao());
        System.out.println(kakashi.descricao());

        System.out.println(naruto.gritarTecnica());
        System.out.println(kakashi.gritarTecnica());
    }
}
