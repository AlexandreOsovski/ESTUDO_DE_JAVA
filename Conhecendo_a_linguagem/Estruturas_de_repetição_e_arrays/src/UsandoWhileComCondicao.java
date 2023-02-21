package src;

import java.util.Scanner;

public class UsandoWhileComCondicao {

    public static void main(String[] args) {

        String notaAluno = (notaAluno(0));
        System.out.println(notaAluno);

    }

    public static String notaAluno(int nota) {

        try (Scanner scanner = new Scanner(System.in)) {
            String resultado = "obrigado!!";

            System.out.println("Digite a nota do aluno: ");
            nota = scanner.nextInt();

            while (nota < 0 || nota > 10) {

                System.out.println("a nota não pode ser menor que 0 e maior que 10");
                nota = scanner.nextInt();

            }
            return resultado;
        }

    }

}
