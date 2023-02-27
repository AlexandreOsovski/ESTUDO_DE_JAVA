package Dragao;

import java.util.*;

public class Dragao {
    public static void main(String[] args) {
        int casos, poderDeLuta;

        try (Scanner scanner = new Scanner(System.in)) {
            casos = scanner.nextInt();

            for (int i = 0; i < casos; i++) {
                poderDeLuta = scanner.nextInt();

                if (poderDeLuta <= 8000) {
                    System.out.println("Inseto!");
                } else {
                    System.out.println("Mais de 8000!");
                }
            }
        }
    }
    /**
     * EXPLICAÇÃO:
     * 
     * O primeiro passo é criar um objeto Scanner para ler a entrada do usuário a
     * partir do console: "Scanner scanner = new Scanner(System.in);"
     * 
     * Em seguida, o código lê o número de casos de entrada com o método
     * "nextInt()": "casos = scanner.nextInt();"
     * 
     * O próximo passo é criar um loop "for" que será executado "casos" vezes.
     * Dentro do loop, o programa lê o valor de "poderDeLuta" com o método
     * "nextInt()": "poderDeLuta = scanner.nextInt();"
     * 
     * Em seguida, o programa verifica se o valor de "poderDeLuta" é menor ou igual
     * a 8000 com o comando "if (poderDeLuta <= 8000)". Se essa condição for
     * verdadeira, o programa exibe "Inseto!" com o comando
     * "System.out.println("Inseto!");". Caso contrário, o programa exibe "Mais de
     * 8000!" com o comando "System.out.println("Mais de 8000!");".
     * 
     * Depois que o loop terminar, o programa é encerrado.
     * 
     */
}
