package src;

import java.util.Scanner;

public class UsandoWhile {

    public static void main(String[] args) throws Exception {

        String resultado = (nomeIdade(null, 0));
        System.out.println(resultado);

    }

    public static String nomeIdade(String nome, int idade) {

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {

                System.out.println("nome:");
                nome = scanner.next();

                if (nome.equals("0")) {
                    break;
                }

                System.out.println("idade:");
                idade = scanner.nextInt();
            }
        }
        String resultado = "O nome do não pode ser 0";

        return resultado;

    }

}
