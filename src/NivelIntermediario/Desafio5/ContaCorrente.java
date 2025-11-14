package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Informe o valor do deposito: " + valor);
        this.saldo += valor;
    }
}
