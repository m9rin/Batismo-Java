package NivelBasico.Arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";
        ninja[4] = "Hinata Hyuga";

        int[] idade = new int[3];
        idade[0] = 12;
        idade[1] = 12;
        idade[2] = 12;

        System.out.println(idade[3]);

        for (int i = 0; i < ninja.length ; i++) {
            System.out.printf("%s \n", ninja[i]);
        }

        int array[] = {1,2,3};
        int[] array1 = {1,2,3};

        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            System.out.println(array1[i]);
        }
    }
}
