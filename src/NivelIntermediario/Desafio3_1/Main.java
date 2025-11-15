package NivelIntermediario.Desafio3_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        List<Ninja>groupNinjas = new ArrayList<>();


        do {
            Menu.exibirMenu();
            option = input.nextInt();

            switch (option) {
                case 1:
                    NinjaServices.listNinjas(groupNinjas);
                    break;
                case 2:
                    NinjaServices.addNewNinja(groupNinjas);
                    break;
                case 3:
                    NinjaServices.changeSkills();
                    break;
                default:
                    System.out.println("Invalid option, Try again.");
                    break;
            }
        } while (option != 4);
    }
}
