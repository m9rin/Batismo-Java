package NivelBasico.Arrays.Exercicios;

public class Exercicio1 {
    public static void main(String[] args) {
        String ninjas[] = new String[5];

        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        ninjas[3] = "Kakashi";
        ninjas[4] = "Hinata";

        for (int i = 0; i < ninjas.length ; i++) {
            System.out.println(ninjas[i]);
        }
    }
}
