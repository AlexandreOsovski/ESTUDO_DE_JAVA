package FibonacciFacil;

import java.io.IOException;
import java.util.*;

public class FibonacciFacil {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int N = scanner.nextInt();

            int proximo, anterior = 0, atual = 1;

            for (int i = 1; i <= N; i++) {

                if (i == N) {
                    System.out.println(anterior);
                } else {
                    System.out.print(anterior + " ");
                }

                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }
    }

    /**
     * EXPLICAÇÃO:
     * 
     * O trecho "Scanner scanner = new Scanner(System.in);" cria um objeto da classe
     * Scanner que será usado para receber a entrada do usuário pelo console.
     * 
     * Em seguida, é exibida uma mensagem solicitando que o usuário digite um
     * número, e o número é armazenado na variável "N" com o método
     * "scanner.nextInt()".
     * 
     * As variáveis "proximo", "anterior" e "atual" são inicializadas com os valores
     * 0, 1 e 1, respectivamente. Essas variáveis serão usadas para calcular os
     * números da sequência de Fibonacci.
     * 
     * O laço "for" é usado para calcular e imprimir os números da sequência de
     * Fibonacci até o número N informado pelo usuário. Ele inicia com i igual a 1 e
     * se repete até i ser igual a N.
     * 
     * Dentro do laço, é verificado se i é igual a N. Se for, o número anterior da
     * sequência é impresso na tela com o método "System.out.println(anterior)".
     * Caso contrário, o número anterior é impresso na tela seguido de um espaço com
     * o método "System.out.print(anterior + " ");".
     * 
     * A variável "proximo" é calculada como a soma das variáveis "anterior" e
     * "atual". A variável "anterior" é atualizada com o valor de "atual", e a
     * variável "atual" é atualizada com o valor de "proximo". Esse processo é
     * repetido em cada iteração do laço, gerando os números da sequência de
     * Fibonacci.
     * 
     * 
     */
}
