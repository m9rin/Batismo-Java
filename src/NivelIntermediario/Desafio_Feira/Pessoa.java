package NivelIntermediario.Desafio_Feira;

public class Pessoa {
    String nome;
    Cesta cesta;

    public Pessoa(String nome) {
        this.nome = nome;
        this.cesta = new Cesta();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cesta=" + cesta +
                '}';
    }

    public void colocarFruta(String nomeDaFruta) {
        Fruta novaFruta = new Fruta(nomeDaFruta);
        this.cesta.frutas.add(novaFruta);
    }
}
