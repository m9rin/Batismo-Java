package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico(
                "Naruto Uzumaki",
                15,
                "Rasengan"
        );

        NinjaAvancado guy = new NinjaAvancado(
                "Might Guy",
                26,
                "Hachimon Tonkou",
                "Taijutsu"
        );

        NinjaBasico sasuke = new NinjaBasico(
                "Sasuke Uchiha",
                16,
                "Chidori",
                TipoHabilidade.KATON
        );

        NinjaAvancado kakashi = new NinjaAvancado(
                "Hatake Kakashi",
                29,
                "Chidori",
                TipoHabilidade.NINJUTSU,
                "Chidori"
        );

        naruto.mostrarInformacoes();
        naruto.executarHabilidade();
        guy.mostrarInformacoes();
        guy.executarHabilidade();
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();
        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();
    }
}
