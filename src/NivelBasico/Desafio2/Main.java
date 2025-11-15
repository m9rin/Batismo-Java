package NivelBasico.Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Ninja> listNinjas = new ArrayList<>();
        int option;

        do {
            MenuService.showMenu();
            option = input.nextInt();
            input.nextLine();
            switch(option) {
                case 1:
                    NinjaServices.newNinja(input, listNinjas);
                    break;
                case 2:
                    NinjaServices.listNinjas(listNinjas);
                    break;
                case 3:
                    System.out.println("Finished.");
                    input.close();
                    break;
                default:
                    System.out.println("Invalid option. Try again");
                    break;
            }
        } while (option != 3);
    }
}
