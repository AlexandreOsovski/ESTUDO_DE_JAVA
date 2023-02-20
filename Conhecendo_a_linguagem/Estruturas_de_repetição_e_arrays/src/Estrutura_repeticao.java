package src;

import java.util.Scanner;

public class Estrutura_repeticao {

    public static void main(String[] args) throws Exception {

        // String resultado = (nomeIdade(null, 0));
        // System.out.println(resultado);

        String notaAluno = (notaAluno(0));
        System.out.println(notaAluno);

    }

    /**
     * @param nome
     * @param idade
     * @return
     */
    public static String nomeIdade(String nome, int idade) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nome:");
            nome = scanner.next();
            if (nome.equals("0"))
                break;
            System.out.println("idade");
            idade = scanner.nextInt();
        }

        String resultado = "Continue aqui";
        return resultado;

    }

    public static String notaAluno(int nota) {
        Scanner scanner = new Scanner(System.in);

        String resultado = "obrigado!!";

        System.out.println("Digite a nota do aluno: ");
        nota = scanner.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("a nota não pode ser menor que 0 e maior que 10");
            nota = scanner.nextInt();
        }
        return resultado;

    }

    public static String notas(int notas) {
        Scanner scanner = new Scanner(System.in);

    }
}
