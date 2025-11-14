package Heranca.Naruto;

public class Jounin extends Shinobi {
    private int missoesRankA;

    public Jounin(String nome, String vila, int missoesRankA) {
        super(nome, vila);
        this.missoesRankA = missoesRankA;
    }

    public int getMissoesRankA() {
        return missoesRankA;
    }

    @Override
    public String descricao() {
        return "Jounin: " + getNome() + " Vila: " + getVila() + ", Missões Rank A: " + missoesRankA;
    }

    @Override
    public String gritarTecnica() {
        return "Chidori!";
    }
}
