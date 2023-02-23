package ImprimindoPositivoMedia;

import java.io.IOException;
import java.util.Scanner;

public class ImprimindoPositivoMedia {

    public static void main(String[] args) throws IOException {

        System.out.println("Por favor, digite 6 números: ");
        Scanner scanner = new Scanner(System.in);

        int cont = 0;
        double soma = 0;

        for (int i = 0; i < 6; i++) {

            double valor = scanner.nextDouble();

            if (valor > 0) {
                cont++;
                soma += valor;
            }
        }

        System.out.println("São " + cont + " valores positivos");
        System.out.println(String.format("A média dos valores é: " + "%.1f", soma / cont));
    }

    /**
     * EXPLICAÇÃO:
     * 
     * 
     * O trecho "Scanner scanner = new Scanner(System.in);" cria um objeto da classe
     * Scanner que será utilizado para receber a entrada do usuário pelo console.
     * 
     * Em seguida, é criada uma variável "cont" inicializada com o valor zero e uma
     * variável "soma" inicializada com o valor zero. Essas variáveis serão usadas
     * para contar quantos valores positivos foram inseridos pelo usuário e somar
     * esses valores.
     * 
     * O laço "for" será executado seis vezes, onde o usuário irá inserir um valor
     * pelo console usando o método "scanner.nextDouble()". Esse valor será
     * armazenado na variável "valor".
     * 
     * Se o valor inserido for maior que zero, a variável "cont" é incrementada em 1
     * e o valor é adicionado à variável "soma".
     * 
     * Após o laço "for", o código imprime o número de valores positivos que foram
     * inseridos pelo usuário e a média dos valores positivos. A média é calculada
     * dividindo a variável "soma" pelo número de valores positivos armazenados na
     * variável "cont". O método "String.format()" é usado para formatar a saída da
     * média com uma casa decimal.
     */
}
