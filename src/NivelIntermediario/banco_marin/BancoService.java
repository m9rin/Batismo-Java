package NivelIntermediario.banco_marin;

public class BancoService {
    public void transferir(Conta contaOrigem,Conta contaDestino, Double valor) {
        if (contaOrigem.getSaldo() < 0) {
            System.out.println("Saldo abaixo do valor para transferencia");
            return;
        }
        System.out.println("Atual valor da conta antes da transferencia " + contaOrigem.getSaldo());
        contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
        System.out.println("Atual valor da conta apó da transferencia " + contaOrigem.getSaldo());
        System.out.println("---- OPERACAO REALIZADA COM SUCESSO ----");
    }
}
