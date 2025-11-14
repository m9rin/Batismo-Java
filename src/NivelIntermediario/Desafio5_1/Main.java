package NivelIntermediario.Desafio5_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Banco de Konoha");
        System.out.println();

        BancoKonoha contaNaruto = new BancoKonoha(
                "001",
                "Naruto Uzumaki",
                TipoConta.CORRENTE
        );

        BancoKonoha contaSasuke = new BancoKonoha(
                "002",
                "Sasuke uchiha",
                TipoConta.POUPANCA
        );
    }
}
