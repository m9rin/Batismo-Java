package NivelIntermediario.Desafio3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        List grupoNinjas = new ArrayList<>();


        do {
            Menu.exibirMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    NinjaServices.listarNinjas(grupoNinjas);
                    break;
                case 2:
                    NinjaServices.adicionarNinja(grupoNinjas);
                    break;
                case 3:
                    NinjaServices.alterarHabilidade();
                    break;
                default:
                    System.out.println("Opcao Invalida! Tente novamente.");
                    break;
            }
        } while (opcao != 4);
    }
}
