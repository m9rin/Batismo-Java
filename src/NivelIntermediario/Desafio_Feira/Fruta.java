package NivelIntermediario.Desafio_Feira;

public class Fruta {
    String name;

    public Fruta(String nome){
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "name='" + name + '\'' +
                '}';
    }
}
