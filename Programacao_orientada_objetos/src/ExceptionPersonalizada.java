package src;

import javax.swing.*;
import java.io.*;

public class ExceptionPersonalizada {
    public static void main(String[] args) throws impossivelAberturaDeArquivoException {
        String lerJogosQueEuGostoTxt = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        lerJogosQueEuGosto(lerJogosQueEuGostoTxt);
        System.out.println("Chegou aquii!!!");


    }

    public static void lerJogosQueEuGosto(String arquivosDeJogos) throws impossivelAberturaDeArquivoException {

        try {
            BufferedReader bufferedReader = lerArquivos(arquivosDeJogos);

            String linha = bufferedReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
                linha = bufferedReader.readLine();
            } while (linha != null);

            bufferedWriter.flush();
            bufferedReader.close();

        }catch (impossivelAberturaDeArquivoException erro){
            JOptionPane.showMessageDialog(null, "o arquivo " +  arquivosDeJogos + " não foi encontrado");
            erro.printStackTrace();
        }
        catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o arquivo" + erro.getMessage());
            erro.printStackTrace();
        }


    }

    public static BufferedReader lerArquivos(String arquivosDeJogos) throws impossivelAberturaDeArquivoException {
        File file = new File(arquivosDeJogos);

        try {
            return new BufferedReader(new FileReader(arquivosDeJogos));
        } catch (FileNotFoundException erro) {
            throw new impossivelAberturaDeArquivoException(file.getName(), file.getPath());

        }

    }
}


class impossivelAberturaDeArquivoException extends Exception {
    private String nomeDoAquivo;
    private String diretorio;

    public impossivelAberturaDeArquivoException(String nomeDoAquivo, String diretorio) {
        super("O arquivo " + nomeDoAquivo + " não foi encontrado!!! " + diretorio);
        this.nomeDoAquivo = nomeDoAquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "impossivelAberturaDeArquivoException{" +
                "nomeDoAquivo='" + nomeDoAquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
























