package NivelBasico.Desafio2;

import java.util.List;
import java.util.Scanner;

public class NinjaServices {
    public static void newNinja(Scanner input, List<Ninja> listNinjas) {
        Ninja ninja = new Ninja();
        System.out.println("Ninja name: ");
        ninja.setName(input.nextLine());
        System.out.println("Ninja age: ");
        ninja.setAge(input.nextInt());
        input.nextLine();
        listNinjas.add(ninja);
    }

    public static void listNinjas(List<Ninja> listNinjas) {
        System.out.println();
        System.out.println("===== New Ninjas =====");
        for (Ninja n : listNinjas) {
            System.out.println(n);
        }
    }
}
