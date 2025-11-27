package NivelIntermediario.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;

public class ListaNinja {
    LinkedList<Ninja> listNinja = new LinkedList<>();

    public void adicionarNinja(Ninja novoNinja) {
        listNinja.add(novoNinja);
    }

    public void listarNinjas() {
        System.out.println("----------------- LISTA DE NINJAS -----------------");
        for (Ninja ninja : listNinja) {
            System.out.println(ninja);
        }
    }

    public void listarNinjasPorNome() {
        listNinja.sort(Comparator.comparing(Ninja::getNome));
        System.out.println("----------------- LISTA DE NINJAS ORDEM ALFABÉTICA -----------------");
        for (Ninja ninja : listNinja) {
            System.out.println(ninja);
        }
    }

    public void listarNinjasPorAldeia() {
        listNinja.sort(Comparator.comparing(Ninja::getVila));
        System.out.println("----------------- LISTA DE NINJAS POR ALDEIA -----------------");
        for (Ninja ninja : listNinja) {
            System.out.println(ninja);
        }
    }

    public void listarNinjasPorIdade() {
        listNinja.sort(Comparator.comparing(Ninja::getIdade));
        System.out.println("----------------- LISTA DE NINJAS POR IDADE -----------------");
        for (Ninja ninja : listNinja) {
            System.out.println(ninja);
        }
    }

    public void adicionarNoInicioDaLista(Ninja novoNinja) {
        listNinja.addFirst(novoNinja);
    }

    public void removerNoInicioDaLista() {
        listNinja.removeFirst();
    }

    public void procurarNinja(int i) {
        System.out.println("------ Resultado de Pesquisa ------");
        System.out.println("Ninja Selecionado: " + listNinja.get(i));
    }
}
