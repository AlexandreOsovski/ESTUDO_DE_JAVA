package src;

import java.util.Scanner;

public class UsandoFor {

    public static void main(String[] args) {
        System.out.println((tabuada(0, 0)));
    }

    public static String tabuada(int tabuada, int multiplicador) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite um numero para saber a sua tabuada: ");
            tabuada = scanner.nextInt();

            System.out.println("Digite um numero do multiplicador desejado: ");
            multiplicador = scanner.nextInt();

            for (int i = 0; i <= multiplicador; i++) {
                System.out.println("A tabuada do " + tabuada + "X" + i + " é " + (i * tabuada));

            }
        }

        return "";

    }
}
