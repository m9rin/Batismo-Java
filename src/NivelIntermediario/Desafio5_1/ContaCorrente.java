package NivelIntermediario.Desafio5_1;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numeroConta, String titular, TipoConta tipoConta) {
        super(numeroConta, titular, tipoConta);
    }

    public void depositar(double valor) {
        System.out.println("Valor depositado: " + valor);
        this.saldo += valor;
    }
}
