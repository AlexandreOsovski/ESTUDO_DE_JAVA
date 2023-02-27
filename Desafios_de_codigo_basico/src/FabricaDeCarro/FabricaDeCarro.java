package FabricaDeCarro;

import java.util.*;

public class FabricaDeCarro {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // pegar os dados daqui
            System.out.println("Digite um numero: ");
            int custoFabrica = scanner.nextInt();

            System.out.println("Digite mais numero: ");
            int porcentagemDistribuidor = scanner.nextInt();

            System.out.println("Digite um último numero: ");
            int PercentualImpostos = scanner.nextInt();

            // variaveis
            int custoConsumidor;
            int Distribuidor;
            int ValorImpostos;

            Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
            ValorImpostos = (PercentualImpostos * custoFabrica) / 100;

            custoConsumidor = Distribuidor + ValorImpostos + custoFabrica;

            System.out.println("O custo do consumidor é: " + custoConsumidor);
        }
    }
    /**
     * EXPLICAÇÃO:
     * 
     * O trecho "Scanner scanner = new Scanner(System.in);" cria um objeto da classe
     * Scanner que será usado para receber a entrada do usuário pelo console.
     * 
     * Em seguida, são exibidas mensagens solicitando que o usuário digite o custo
     * de fábrica do produto, o percentual do distribuidor e o percentual de
     * impostos. Os valores informados pelo usuário são armazenados nas variáveis
     * "custoFabrica", "porcentagemDistribuidor" e "PercentualImpostos",
     * respectivamente, com os métodos "scanner.nextInt()".
     * 
     * As variáveis "custoConsumidor", "Distribuidor" e "ValorImpostos" são
     * inicializadas como inteiros com valor zero. Essas variáveis serão usadas para
     * calcular o custo do produto para o consumidor final.
     * 
     * A variável "Distribuidor" é calculada como o produto do custo de fábrica pelo
     * percentual do distribuidor, dividido por 100. A variável "ValorImpostos" é
     * calculada como o produto do custo de fábrica pelo percentual de impostos,
     * dividido por 100. A variável "custoConsumidor" é calculada como a soma desses
     * valores mais o custo de fábrica.
     * 
     * Por fim, o código exibe o valor do custo do consumidor final com a mensagem
     * "O custo do consumidor é: " concatenada com o valor da variável
     * "custoConsumidor".
     */
}
