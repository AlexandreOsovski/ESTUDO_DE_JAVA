public class MinhaClasseInicial {
    public static void main(String[] args) {

        /*
         * DECLARAÇÃO DE VARIÁVEIS EM JAVA
         * 
         * As variáveis em java possuem a seguinte estrutura:
         * 
         * Tipo nomeBemDefinido = Atribuicao;
         * 
         * Tipo -> String, Int, Float, Boolean e double (existem mais, mas esses são os
         * principais)
         * 
         * Atribuicao -> opcional em alguns casos
         * 
         * Exemplo:
         */
        String nomeCompleto = "Alexandre Osovski";
        /*
         * obedeceu a estrutura, possui um tipo (String), possui um nome bem definido
         * (nomeCompleto), e nesse caso possui uma atribuicao também (Alexandre Osovski)
         */

        /*
         * As variáveis em java devem ser escritas no padrão camelCase caso sejam
         * compostas, exemplo:
         * 
         * nomeCompleto -> padrão camelCase
         * caso a variável não possua nome composto, sua primeira letra precisa
         * necessariamente ser com a letra minúscula.
         */

        /*
         * VARIÁVEIS FIXAS
         * 
         * se uma variável for fixa e nunca irá mudar podemos usar duas coisas ao nosso
         * favor
         * 1° Exemplo:
         */
        String BRASIL = "Brasil";

        /*
         * podemos deixar a variável com as letras todas maiúsculas, isso indica para
         * que nunca deva mudar a atribuição dela
         * 
         * 2° Exemplo:
         */
        final String brasil = "Brasil";
        /*
         * o tipo "Final" determina que aquela variável nunca pode mudar
         * 3° exemplo:
         */
        final String BRASIL = "Brasil";
        /*
         * 
         * O QUE PODE CONTER EM UMA VARIÁVEL?
         * 
         * - Pode conter apenas letras, underline, $ ou números de 0 a 9.
         * - Obrigatoriamente iniciar com uma letra, underline ou $, jamais adicionar
         * - Numeros ou qualquer outro caracter que não seja $.
         * - Deve iniciar com uma letra minúscula (boa prática).
         * - Não deve conter espaços.
         * - Nome único dentro de um escopo.
         * - Não usar palavras chaves da linguagem
         * 
         * 
         */
    }

}