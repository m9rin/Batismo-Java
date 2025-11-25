package NivelIntermediario.banco_marin;

public interface Operacoes {
    void transferir(Conta conta, Double valor);
    void depositar(Conta conta, Double valor);
    void sacar(Double valor);
}
