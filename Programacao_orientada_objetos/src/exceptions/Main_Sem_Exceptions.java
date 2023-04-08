package src.exceptions;

import javax.swing.*;
import java.io.*;

public class Main_Sem_Exceptions {
    public static void main(String[] args) {
        String lerJogosQueEuGostoTxt = "jogos_que_eu_gosto.txt";

        try {
            lerJogosQueEuGosto(lerJogosQueEuGostoTxt);
        }catch(FileNotFoundException erro){
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo! " + erro.getCause());
            erro.printStackTrace();
        }

        catch (IOException erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! entre em contato com o admnistrador!! " + erro.getCause());
            erro.printStackTrace();
        }finally {
            System.out.println("Chegou até aqui!!!");
        }

    }

    public static void lerJogosQueEuGosto(String arquivosDeJogos) throws IOException{
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

























