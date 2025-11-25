package NivelIntermediario.banco_marin;

public class ContaCorrente extends Conta {


    public ContaCorrente(String nome) {
        super(nome);
        this.setTipoConta(TipoConta.CORRENTE);
    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {
        if (this.getSaldo() < 0) {
            System.out.println("Saldo abaixo do valor para transferencia");
            return;
        }
        System.out.println("Atual valor da conta antes da transferencia " + this.getSaldo());
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        this.setSaldo(this.getSaldo() - valor);
        System.out.println("Atual valor da conta apó da transferencia " + this.getSaldo());
        System.out.println("---- OPERACAO REALIZADA COM SUCESSO ----");
    }

    @Override
    public void depositar(Conta conta, Double valor) {

    }

    @Override
    public void sacar(Double valor) {

    }
}
