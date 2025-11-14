package NivelIntermediario.Desafio5_1;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numeroConta, String titular, TipoConta tipoConta) {
        super(numeroConta, titular, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Aviso taxa de 1% sobre o valor do depósito!");
        System.out.println("Valor do depósito: " + valor);
        this.saldo += valor - (valor * 0.01);
    }
}
