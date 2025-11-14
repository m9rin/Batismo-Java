package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
//        Tudo que é digitado dentro do psvm é compilado pelo java
        /*
        *  Dados nao primitivos: Strings, Array, Class, Enum
        *  Objetivo: Criar um ninja, e atribuir métodos a ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // toUppercase vai colocar tudo em caixa alta
        System.out.println(nomeUpperCase);
        System.out.println(nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase(); // toLowerCase coloca tudo em caixa baixa
        System.out.println(aldeiaLowerCase);
    }
}
