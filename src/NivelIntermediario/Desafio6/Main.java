package NivelIntermediario.Desafio6;

public class Main {
    public static void main(String[] args) {
        ListaNinja listaNinja = new ListaNinja();

        listaNinja.adicionarNinja(new Ninja("Uzumaki Naruto", 19, "Aldeia da Folha"));
        listaNinja.adicionarNinja(new Ninja("Hatake Kakashi", 31, "Aldeia da Folha"));
        listaNinja.adicionarNinja(new Ninja("Uchiha Sasuke", 19, "Aldeia da Folha"));
        listaNinja.adicionarNoInicioDaLista(new Ninja("Jiraya", 61, "Aldeia da Folha"));
        listaNinja.adicionarNinja(new Ninja("Nara Shikamaru", 21, "Aldeia da Folha"));
        listaNinja.adicionarNoInicioDaLista(new Ninja("Uchiha Itachi", 26, "Renegado"));
        listaNinja.adicionarNinja(new Ninja("Uchiha Madara", 61, "Aldeia da Folha"));
        listaNinja.listarNinjas();
        listaNinja.listarNinjasPorAldeia();
        listaNinja.listarNinjasPorNome();
        listaNinja.listarNinjasPorIdade();
    }
}
