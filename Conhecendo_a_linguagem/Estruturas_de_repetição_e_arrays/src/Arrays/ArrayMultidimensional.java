package src.Arrays;

import java.util.Random;

//Gerar e imprimeir
public class ArrayMultidimensional {
    public static void main(String[] args) {

        Random random = new Random();

        // o primeiro [] significa a linha da Matrix e o segundo [] significa a coluna
        // da matrix
        int[][] Array = new int[4][4];

        for (int i = 0; i < Array.length; i++) {

            for (int j = 0; j < Array[i].length; j++) {

                Array[i][j] = random.nextInt(9);

            }
        }

        System.out.println("A matrix é: ");

        for (int[] linha : Array) {
            for (int coluna : linha) {

                System.out.print(coluna + " ");
            }
            System.out.println("\n");
        }

    }
}
