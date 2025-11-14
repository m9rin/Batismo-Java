package Heranca.DemonSlayer;

public class Hashira extends Cacador {
    private String titulo;

    public Hashira(String nome, String respiracao, String titulo) {
        super(nome, respiracao);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String descricao() {
        return "Nome: " + getNome() + " | Respiração: " + getRespiracao() + " | Título: " + getTitulo();
    }
}
