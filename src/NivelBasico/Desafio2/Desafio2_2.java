package NivelBasico.Desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> ninjas = new ArrayList<String>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Time");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    int tamanhoDoTime = 3;
                    if (ninjas.size() == tamanhoDoTime) {
                        System.out.println("Não há vagas!");
                    } else {
                        input.nextLine();
                        System.out.println("Nome do Ninja: ");
                        for (int i = 0; i < tamanhoDoTime; i++) {
                            String ninja = input.nextLine();
                            ninjas.add(ninja);
                        }
                    }
                    break;
                case 2:
                    System.out.println();
                    for (String ninja : ninjas) {
                        System.out.println(ninja);
                    }
                    break;
                case 3:
                    System.out.println("Obrigado! Até breve...");
                    input.close();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
