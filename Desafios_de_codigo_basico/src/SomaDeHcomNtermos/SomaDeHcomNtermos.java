package SomaDeHcomNtermos;

import java.util.*;

public class SomaDeHcomNtermos {
    public static void main(String[] Args) {

        double h = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            double n = scanner.nextDouble();

            for (int i = 1; i <= n; i++) {
                h = h + (double) 1 / i;
            }
        }

        System.out.println("O valor final é: " + Math.round(h));

    }
    /**
     * EXPLICAÇÃO:
     * 
     * O trecho "double h = 0;" cria uma variável "h" do tipo double inicializada
     * com o valor zero. Essa variável será usada para acumular a soma harmônica.
     * 
     * Em seguida, é criado um objeto da classe Scanner com o trecho "Scanner
     * scanner = new Scanner(System.in);", para que o usuário possa inserir um
     * número pelo console. O número é armazenado na variável "n" com o método
     * "scanner.nextDouble()".
     * 
     * O laço "for" é usado para calcular a soma harmônica. Ele vai somar 1/1, 1/2,
     * 1/3, ..., 1/n. Na primeira iteração, i é igual a 1, e a fração 1/1 é
     * adicionada à variável "h". Na segunda iteração, i é igual a 2, e a fração 1/2
     * é adicionada à variável "h". Esse processo é repetido até a última iteração,
     * onde i é igual a "n".
     * 
     * Após o laço "for", o código imprime o valor da soma harmônica com a chamada
     * do método "Math.round(h)". O método "Math.round()" é usado para arredondar o
     * valor de "h" para o inteiro mais próximo antes de exibi-lo na tela.
     * 
     */
}
