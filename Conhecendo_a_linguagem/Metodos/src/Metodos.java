
public class Metodos {
    public static void main(String[] args) {

        String primeiroNome;
        String segundoNome;

        primeiroNome = "Alexandre";
        segundoNome = "Osovski";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    /*
     * MÉTODOS que retornam o nome completo e o saldoBacário
     * 
     */
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // return primeiroNome + " " + segundoNome;
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
