package NivelBasico.Desafio1;

public class Desafio1_1 {

    public static void criandoNinja(String nome, int idade, String aldeia) {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println(aldeia);
    }

    public static void missaoNinja(String missao, char rank, int idade){

        if (idade < 15 && (rank == 'A' || rank == 'B')) {
            System.out.println("Missao: " + missao);
            System.out.println("Rank: " + rank);
            System.out.println("Ninja não pode participar desta missão");
        } else {
            System.out.println("Missao: " + missao);
            System.out.println("Rank: " + rank);
            System.out.println("Concluida");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        criandoNinja("Naruto Uzumaki", 12, "Aldeia da Folha");
        missaoNinja("Escolta do Tazuna", 'C', 12);

        criandoNinja("Sasuke Uchiha", 12, "Aldeia da Folha");
        missaoNinja("Escolta do Tazuna", 'C', 12);

        criandoNinja("Kakashi Hatake", 26, "Aldeia da Folha");
        missaoNinja("Escolta do Tazuna", 'C', 26);
    }
}
