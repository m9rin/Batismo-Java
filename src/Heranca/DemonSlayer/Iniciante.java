package Heranca.DemonSlayer;

public class Iniciante extends Cacador {
    private String mentor;

    public Iniciante(String nome, String respiracao, String mentor) {
        super(nome, respiracao);
        this.mentor = mentor;
    }

    public String getMentor() {
        return mentor;
    }

    @Override
    public String descricao() {
        return "Nome: " + getNome() + " | Respiração: " + getRespiracao() + " | Mentor: " + getMentor();
    }
}
