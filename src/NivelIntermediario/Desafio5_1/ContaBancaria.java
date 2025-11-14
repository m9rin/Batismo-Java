package NivelIntermediario.Desafio5_1;

public abstract class ContaBancaria implements Conta {
    String numeroConta;
    String titular;
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(String numeroConta, String titular, TipoConta tipoConta) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
        this.tipoConta = tipoConta;
    }

    public ContaBancaria() {}

    @Override
    public void consultarSaldo() {
        System.out.println();
        System.out.println("Numero da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }
}
