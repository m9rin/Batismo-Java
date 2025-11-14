package NivelIntermediario.Desafio3_1;

public class Uchiha extends Ninja {

    public static String habilidadeEspecial = "Sharingan";

    public Uchiha() {
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    @Override
    public String mostrarInformacoes() {
        return super.mostrarInformacoes() + "\nHabilidade: " + getHabilidadeEspecial();
    }
}

