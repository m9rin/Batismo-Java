package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conta Corrente");
        BancoKonoha contaCorrente = new BancoKonoha(0, TipoConta.CORRENTE);

        contaCorrente.consultarSaldo();
        contaCorrente.depositar(250);
        contaCorrente.consultarSaldo();

        System.out.println("////////////////////////////////////////////////////");
        System.out.println();

        BancoKonoha contaPoupanca = new BancoKonoha(0, TipoConta.POUPANCA);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(725.30);
        contaPoupanca.consultarSaldo();

    }
}
