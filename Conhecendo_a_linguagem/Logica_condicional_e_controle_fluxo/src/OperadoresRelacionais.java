package src;

import java.io.ObjectInputFilter.Status;

import javax.annotation.processing.SupportedOptions;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Verificando se um valor é igual a outro
        int x = 5;
        int y = 5;
        if (x == y) {
            System.out.println("x é igual a y");
        }

        // Verificando se um valor é diferente de outro
        int a = 10;
        int b = 20;
        if (a != b) {
            System.out.println("a é diferente de b");
        }

        // Verificando se um valor é maior que outro
        int c = 15;
        int d = 10;
        if (c > d) {
            System.out.println("c é maior que d");
        }

        // Verificando se um valor é menor ou igual a outro
        int e = 5;
        int f = 5;
        if (e <= f) {
            System.out.println("e é menor ou igual a f");
        }

        int valorUm = 10;
        int valorDois = 10;

        String resultadoValores = verificarValores(valorUm, valorDois);
        System.out.println(resultadoValores);

    }

    public static String verificarValores(int valorUm, int valorDois) {

        String resposta;

        if (valorUm < valorDois) {
            resposta = "valorUm é menor que valorDois";
        } else if (valorUm == valorDois) {
            resposta = "valorUm é igual a valorDois";
        } else {
            resposta = "valorUm é maior que valorDois";
        }
        return resposta;
    }

}
