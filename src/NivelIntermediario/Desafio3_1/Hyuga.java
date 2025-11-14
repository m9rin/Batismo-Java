package NivelIntermediario.Desafio3_1;

public class Hyuga extends Ninja {
    public static String habilidadeEspecial = "Byakugan";

    public Hyuga() {
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    @Override
    public String mostrarInformacoes() {
        return super.mostrarInformacoes() + "\nHabilidade: " + getHabilidadeEspecial();
    }
}

