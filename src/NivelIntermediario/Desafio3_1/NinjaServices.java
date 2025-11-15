package NivelIntermediario.Desafio3_1;
import java.util.List;
import java.util.Scanner;

public class NinjaServices {


    public static void listNinjas(List<Ninja> groupNinjas) {
        for (Ninja ninja : groupNinjas) {
            System.out.println(ninja.showInfo());
        }
    }


    public static void addNewNinja(List<Ninja> groupNinjas) {
        Scanner input = new Scanner(System.in);
        int option;
        Ninja newNinja;
        System.out.println("What type of Ninja? \n1 - Default \n2 - Cla Uchiha \n3 - Cla Hyuga \n4 - Back");
        option = input.nextInt();
        input.nextLine();
        newNinja = typeNinja(option);
        if (newNinja == null) return;
        System.out.println("Ninja name: ");
        newNinja.setName(input.nextLine());
        System.out.println("Ninja age: ");
        newNinja.setAge(input.nextInt());
        input.nextLine();
        System.out.println("Mission: ");
        newNinja.setMissao(input.nextLine());
        missionValidation(newNinja, input);
        groupNinjas.add(newNinja);
    }


    private static Ninja typeNinja(int option) {
        Ninja newNinja;
        switch (option) {
            case 1:
                newNinja = new Ninja();
                break;
            case 2:
                newNinja = new Uchiha();
                break;
            case 3:
                newNinja = new Hyuga();
                break;
            default:
                return null;
        }
        return newNinja;
    }


    private static void missionValidation(Ninja newNinja, Scanner input) {
        if (newNinja.getMission().isEmpty()) {
            newNinja.setMissao(" - ");
            newNinja.setRank(RankEnum.EMPTY.getDescription());
            newNinja.setStatus(StatusEnum.EMPTY.getDescription());
        } else {
            System.out.println("Rank: (S / A / B / C / D)");
            String rank = input.nextLine();
            newNinja.setRank(RankEnum.fromString(rank));
            System.out.println("Status: (TO DO / IN PROGRESS / COMPLETED / -");
            String status = input.nextLine();
            newNinja.setStatus(StatusEnum.fromString(status));
        }
    }

    public static void changeSkills() {
        final String newSkill = "New Skill: ";
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Ninja Uchiha \n2 - Ninja Hyuga");
        if (input.nextInt() == 1) {
            input.nextLine();
            System.out.println(newSkill);
            Uchiha.specialAbility = input.nextLine();
        } else {
            input.nextLine();
            System.out.println(newSkill);
            Hyuga.specialAbility = input.nextLine();
        }
    }
}

