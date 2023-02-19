public class Imc {

    // ! throws Exception Determina que pode haver alguma excessão quando rodar o
    // ! código
    public static void main(String[] args) throws Exception {

        Double a = (double) 10;
        Double b = (double) 20;

        String resultado = codigoImcSemIdentacao(a, b);
        System.out.println(resultado);

        int dividendo = 10;
        int divisor = 10;
        double divisao = dividir(dividendo, divisor);

        System.out.println(verificaDivisao(divisao));

    }

    public static String codigoImcSemIdentacao(Double peso, Double altura) {
        String resultado;
        Double resultadoImc = peso / (altura * altura);
        if (resultadoImc < 19) {
            resultado = "Seu peso está baixo";
        } else if (resultadoImc > 19 && resultadoImc < 25) {
            resultado = "Seu peso é ideal";
        } else {
            resultado = "você está acima do peso";
        }
        return resultado;
    }

    public static String codigoImcComIdentacao(Double peso, Double altura) {

        String resultado;
        Double resultadoImc = peso / (altura * altura);

        if (resultadoImc < 19) {
            resultado = "Seu peso está baixo";
        } else if (resultadoImc > 19 && resultadoImc < 25) {
            resultado = "Seu peso é ideal";
        } else {
            resultado = "você está acima do peso";
        }

        return resultado;
    }

    // ! throws Exception Determina que pode haver alguma excessão quando rodar o
    // ! código
    public static double dividir(int dividendo, int divisor) throws Exception {
        return dividendo / divisor;

    }

    public static String verificaDivisao(double resultadoDivisao) throws Exception {

        String escrita;

        if (resultadoDivisao >= 0) {
            escrita = "verdadeiro";
        } else {
            escrita = "Falso";
        }
        return escrita;

    }

    /*
     * O que fazer.
     * 
     * (1) caracteristicas: ligada (boolean), canal(int), volume(int)
     * (2) Nossa Tv poderá ligar e desligar, e assim mudar o estado ligada
     * (3) Nossa Tv aumentará e diminuirá o volume sempre em +1 ou -1
     * (4) Nossa Tv poderá mudar o canal de 1 em 1 ou definindo o número
     * correspondente
     * 
     */

}
