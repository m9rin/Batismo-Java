package NivelIntermediario.Desafio3_1;
import java.util.List;
import java.util.Scanner;

public class NinjaServices {


    public static void listarNinjas(List grupoNinjas) {
        for (Object ninja : grupoNinjas) {
            System.out.println(ninja.toString());
        }
    }


    public static void adicionarNinja(List grupoNinjas) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Ninja novoNinja;
        System.out.println("Que tipo de Ninja? \n1 - Comum \n2 - Cla Uchiha \n3 - Cla Hyuga \n4 - Voltar");
        opcao = input.nextInt();
        input.nextLine();
        novoNinja = tipoNinja(opcao);
        if (novoNinja == null) return;
        System.out.println("Nome: ");
        novoNinja.setNome(input.nextLine());
        System.out.println("Idade: ");
        novoNinja.setIdade(input.nextInt());
        input.nextLine();
        System.out.println("Missao: ");
        novoNinja.setMissao(input.nextLine());
        validaMissao(novoNinja, input);
        grupoNinjas.add(novoNinja);
    }


    private static Ninja tipoNinja(int opcao) {
        Ninja novoNinja;
        switch (opcao) {
            case 1:
                novoNinja = new Ninja();
                break;
            case 2:
                novoNinja = new Uchiha();
                break;
            case 3:
                novoNinja = new Hyuga();
                break;
            default:
                return null;
        }
        return novoNinja;
    }


    private static void validaMissao(Ninja novoNinja, Scanner input) {
        if (novoNinja.getMissao().isEmpty()) {
            novoNinja.setMissao(" - ");
            novoNinja.setDificuldade(" - ");
            novoNinja.setStatus(" - ");
        } else {
            System.out.println("Dificuldade: ");
            novoNinja.setDificuldade(input.nextLine());
            System.out.println("Status: ");
            novoNinja.setStatus(input.nextLine());
        }
    }

    public static void alterarHabilidade() {
        final String informeHabilidade = "Informe a nova Habilidade: ";
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Ninja Uchiha \n2 - Ninja Hyuga");
        if (input.nextInt() == 1) {
            input.nextLine();
            System.out.println(informeHabilidade);
            Uchiha.habilidadeEspecial = input.nextLine();
        } else {
            input.nextLine();
            System.out.println(informeHabilidade);
            Hyuga.habilidadeEspecial = input.nextLine();
        }
    }
}

