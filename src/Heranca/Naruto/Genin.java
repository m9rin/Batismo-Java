package Heranca.Naruto;

public class Genin extends Shinobi {
    private String sensei;

    public Genin(String nome, String vila, String sensei) {
        super(nome, vila);
        this.sensei = sensei;
    }

    public String getSensei() {
        return sensei;
    }

    @Override
    public String descricao() {
        return "Genin: " + getNome() + " Vila: " + getVila() + ", Sensei: " + getSensei();
    }

    @Override
    public String gritarTecnica() {
        return "Kage Bunshin no Jutsu!";
    }
}
