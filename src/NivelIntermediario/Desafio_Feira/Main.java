package NivelIntermediario.Desafio_Feira;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("gabriel");
        System.out.println(pessoa);
        String format = String.format("oi meu nome e %s", pessoa.nome);
        System.out.println(format);
        System.out.println(" eu tenho na minha cesta essa quantidade de frutas: " + pessoa.cesta.frutas.size());
        pessoa.colocarFruta("abacaxi");
        System.out.println(" eu tenho na minha cesta essa quantidade de frutas: " + pessoa.cesta.frutas.size());
        System.out.println(pessoa.cesta.frutas);
    }
}
