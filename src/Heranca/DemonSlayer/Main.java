package Heranca.DemonSlayer;

public class Main {
    public static void main(String[] args) {
        Iniciante tanjiro = new Iniciante("Tanjiro", "da Água", "Urokodaki");
        Hashira rengoku = new Hashira("Rengoku", "das Chamas", "Hashira do Fogo");

        System.out.println(tanjiro.descricao());
        System.out.println(rengoku.descricao());
    }
}
