package NivelBasico.Arrays.Exercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        String personagens[] = {"Goku", "Vegeta", "Gohan", "Broly", "Trunks", "Piccolo", "Android 17"};
        int poder[] = {10000, 8000, 7500, 12000, 8000, 6000, 9500};

        System.out.println("=== NIVEIS DE PODER ===");
        for (int i = 0; i < personagens.length; i++) {
            System.out.println(personagens[i] + ": " + poder[i]);

        }
        System.out.println();

        int soma = 0;
        double media;
        System.out.println("=== MÈDIA DE PODER ===");
        for (int i = 0; i < poder.length; i++) {
            soma = soma + poder[i];
        }
        media = soma / poder.length;
        System.out.println("Média: " + media);

        String maisForte = personagens[0];
        int poderMaisForte = poder[0];
        for (int i = 0; i < personagens.length; i++) {
            if (poderMaisForte < poder[i]) {
                maisForte = personagens[i];
                poderMaisForte = poder[i];
            }
        }
        System.out.println("Mais forte: " + maisForte + " (" + poderMaisForte + ")");

        String maisFraco = personagens[0];
        int poderMaisFraco = poder[0];
        for (int i = 0; i < personagens.length; i++) {
            if (poder[i] < poderMaisFraco) {
                maisFraco = personagens[i];
                poderMaisFraco = poder[i];
            }
        }
        System.out.println("Mais fraco: " + maisFraco + " (" + poderMaisFraco + ")");
        System.out.println();

        System.out.println("=== Personagens acima de Média ===");
        for (int i = 0; i < personagens.length ; i++) {
            if (poder[i] > media ) {
                System.out.println(personagens[i] + ":" + " (" + poder[i] + ")");
            }
        }
    }
}
