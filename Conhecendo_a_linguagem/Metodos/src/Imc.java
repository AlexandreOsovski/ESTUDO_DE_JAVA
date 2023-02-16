public class Imc {

    public static void main(String[] args) {

        Double a = (double) 10;
        Double b = (double) 20;

        String resultado = codigoImcSemIdentacao(a, b);
        System.out.println(resultado);
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

}
