package NivelIntermediario.banco_marin;

import java.util.Random;

public abstract class Conta implements Operacoes {
    private String id;
    private Double saldo;
    private TipoConta tipo;
    private String nome;

    public Conta(String nome) {
        this.nome = nome;
        this.id = String.valueOf(new Random().nextInt(10));
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome(){
        return this.nome;
    }

    public TipoConta setTipoConta(TipoConta tipo) {
        return this.tipo = tipo;
    }

    public void mostrarConta(){
        System.out.println("NUMERO DA CONTA: " + this.id);
        System.out.println("NOME: " + this.nome);
        System.out.println("SALDO: " + this.saldo);
        System.out.println("TIPO: " + this.tipo);
    }
}
