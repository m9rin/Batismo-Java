package NivelBasico.Arrays.Exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        String tripulacao[] = new String[6];
        String poder[] = new String[6];

        tripulacao[0] = "Monkey D. Luffy";
        tripulacao[1] = "Portgas D. Ace";
        tripulacao[2] = "Monkey D. Garp";
        tripulacao[3] = "Shanks";
        tripulacao[4] = "Roronoa Zoro";
        tripulacao[5] = "Sanji";

        poder[0] = "Gomu Gomu no Mi";
        poder[1] = "Mera Mera no Mi";
        poder[2] = "Força fisica sobre humana";
        poder[3] = "Usa três formas de Haki";
        poder[4] = "Mestre nas 3 espadas";
        poder[5] = "Perna negra";

        for (int i = 0; i < tripulacao.length ; i++) {
                System.out.println(tripulacao[i] + " tem o poder: " + poder[i]);
        }

        String nomeMaisLongo = tripulacao[0];

        for (int i = 0; i < tripulacao.length; i++) {
            if (tripulacao[i].length() > nomeMaisLongo.length()) {
                nomeMaisLongo = tripulacao[i];
            }
        }
        System.out.println("O personagem com nome mais longo: " + nomeMaisLongo);
    }
}
