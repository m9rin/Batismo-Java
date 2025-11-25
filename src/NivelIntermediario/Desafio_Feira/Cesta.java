package NivelIntermediario.Desafio_Feira;

import java.util.ArrayList;
import java.util.List;

public class Cesta {
    List<Fruta> frutas = new ArrayList<>();

    public Cesta(){
        frutas.add(new Fruta("banana"));
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "frutas=" + frutas +
                '}';
    }
}
