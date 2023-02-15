
public class Metodos {
    public static void main(String[] args) {

        String primeiroNome;
        String segundoNome;

        primeiroNome = "Alexandre";
        segundoNome = "Osovski";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        float saldoBancario;
        saldoBancario = 1000;

        float saldoTotalBanco = saldoBancario(saldoBancario);
        System.out.println("Seu saldo bancario é: " + saldoTotalBanco);
    }

    /*
     * MÉTODOS que retornam o nome completo e o saldoBacário
     * 
     */
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // return primeiroNome + " " + segundoNome;
        return "O resultado do método é: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static float saldoBancario(Float valorTotal) {
        return valorTotal;
    }

}
