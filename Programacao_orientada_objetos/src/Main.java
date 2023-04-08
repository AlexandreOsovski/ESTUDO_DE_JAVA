package src;

import java.io.*;

public class Main {

    public static void main(String[] args) throws  IOException{
        String lerJogosQueEuGostoTxt = "jogos_que_eu_gosto.txt";

        lerJogosQueEuGosto(lerJogosQueEuGostoTxt);
    }

    public static void lerJogosQueEuGosto(String arquivosDeJogos) throws IOException {
        File file = new File(arquivosDeJogos);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getName()));

        String linha = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }while (linha != null);

            bufferedWriter.flush();
            bufferedReader.close();

    }
}
