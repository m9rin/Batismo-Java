package NivelIntermediario.Desafio5_1;

public class BancoKonoha extends ContaBancaria {

    public BancoKonoha(String numeroConta, String titular, TipoConta tipoConta) {
        super(numeroConta, titular, tipoConta);
    }

    @Override
    public void depositar(double valor) {

        if (tipoConta == TipoConta.POUPANCA) {
            System.out.println("Aviso taxa de 1% sobre o valor do depósito!");
            System.out.println("Valor do depósito: " + valor);
            System.out.println();
            this.saldo += valor - (valor * 0.01);
        }

        System.out.println("Valor do depósito: " + valor);
        this.saldo += valor;
    }

    public void transferencia(ContaBancaria destino, double valor) {
        System.out.println("Valor transferido: " + valor);
        destino.saldo += valor;
    }
}
