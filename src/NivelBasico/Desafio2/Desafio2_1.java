package NivelBasico.Desafio2;

import java.util.Random;
import java.util.Scanner;

public class Desafio2_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int vagas = 4;
        int cadastrados = 0;
        String[] ninjas = new String[vagas];

        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Time");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    if (cadastrados == vagas) {
                        System.out.println("Time com todas vagas preenchidas!");
                    } else {
                        input.nextLine();
                        for (int i = 0; i < vagas; i++) {
                            System.out.println("Nome do Ninja: ");
                            if (ninjas[i] == null) {
                                ninjas[i] = input.nextLine();
                                cadastrados++;
                            }
                        }
                    }
                    break;

                case 2:
                    Random random = new Random();
                    int time = random.nextInt(11);
                    System.out.println("Time: " + time);

                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            System.out.println("");
                        } else if (ninjas[i] == ninjas[0]) {
                            System.out.println("Mentor: " + ninjas[0]);
                            System.out.print("Ninjas: ");
                        } else {
                            System.out.print(ninjas[i] + " ");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Informe o indice do Ninja que vai ser retirado do time: (0 a " + (vagas - 1) + "): ");
                    int indice = input.nextInt();
                    if (indice < 0 || indice >= vagas) {
                        System.out.println("Indice inválido.");
                    } else if (ninjas[indice] == null) {
                        System.out.println("Ninja não encontrado!");
                    } else {
                        System.out.println("Removendo: " + ninjas[indice]);
                        ninjas[indice] = null;
                        cadastrados--;
                        System.out.println("Ninja removido com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado! até breve...");
                    input.close();
                    break;

                default:
                    System.out.println("Opcao Invalida tente novamente!");
            }
        }
    }
}
