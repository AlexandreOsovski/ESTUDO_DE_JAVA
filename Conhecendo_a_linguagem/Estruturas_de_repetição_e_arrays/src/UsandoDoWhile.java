package src;

import java.util.Scanner;

public class UsandoDoWhile {
    public static void main(String[] args) {

        // System.out.println(maior(0));
        System.out.println(numerosParesImpares(0));

    }

    public static String maior(int numeros) {

        try (Scanner scanner = new Scanner(System.in)) {
            int contador = 0;
            int maiorNumero = 0;
            int soma = 0;

            do {

                System.out.println("Numeros: ");
                numeros = scanner.nextInt();

                if (numeros > maiorNumero) {
                    maiorNumero = numeros;
                }
                soma = soma + numeros;
                contador = contador + 1;

            } while (contador < 5);

            String resultado = "O maior numero é: " + maiorNumero;
            System.out.println(resultado);

            resultado = "A media dos numeros é: " + (soma / 5);
            return resultado;
        }
    }

    public static String media(int numeros) {

        try (Scanner scanner = new Scanner(System.in)) {
            int contador = 0;
            int soma = 0;

            do {

                System.out.println("Numeros: ");
                numeros = scanner.nextInt();

                soma = soma + numeros;
                contador = contador + 1;

            } while (contador < 5);

            String resultado = "A media dos numeros é: " + (soma / 5);
            return resultado;
        }
    }

    public static String numerosParesImpares(int numeros) {

        try (Scanner scanner = new Scanner(System.in)) {

            int contador = 0;
            int quantidadePares = 0;
            int quantidadeImpares = 0;

            System.out.println("Digite a quantidade de numeros");
            int quantidadeNumeros = scanner.nextInt();

            do {
                System.out.println("Numero: ");
                numeros = scanner.nextInt();

                if (numeros % 2 == 0) {
                    quantidadeImpares++;

                } else {
                    quantidadePares++;

                }

                contador++;
            } while (contador < quantidadeNumeros);
            System.out.println("A quantidade de pares é: " + quantidadePares);
            System.out.println("A quantidade de impares é: " + quantidadeImpares);
            return null;
        }

    }

}
