package NivelIntermediario.banco_marin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        Conta cc1 = new ContaCorrente("Lucas");
        cc1.setSaldo(50.00);
        Conta cc2 = new ContaCorrente("Gabriel");
        cc2.setSaldo(25.00);
        Conta cc3 = new ContaCorrente("Gleyce");
        cc3.setSaldo(100.00);
        Conta cc4 = new ContaCorrente("Madona");
        cc4.setSaldo(200.00);
        contas = Arrays.asList(cc1,cc2,cc3,cc4);


        Conta contaEncontrada = procuraPeloNome("Madona", contas);
        if(contaEncontrada != null){
            contaEncontrada.mostrarConta();
        } else {
            System.out.println("Conta nao encontrada");
        }
    }

    public static void testeTransferir(){
        Conta cc = new ContaCorrente("Lucas");
        cc.setSaldo(10.00);
        Conta cc2 = new ContaCorrente("Gabriel");
        cc.transferir(cc2, 5.0);
    }

    public static Conta procuraPeloNome(String nome, List<Conta> contas){
        System.out.println(" ----- Procurando pelo nome "+nome+" ----- ");
        for(Conta conta: contas) {
            if (nome.equals(conta.getNome()))
                return conta;
        }
        return null;
    }
}
