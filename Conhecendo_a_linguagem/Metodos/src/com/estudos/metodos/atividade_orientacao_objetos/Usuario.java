package com.estudos.metodos.atividade_orientacao_objetos;

public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        if (smartTv.ligada == false) {
            System.out.println("A Tv está Desligada");

        } else {

            System.out.println("A Tv está ligada");

            smartTv.mudarCanal(12);
            System.out.println("O canal da tv está no: " + smartTv.canal);

            smartTv.mudarVolume(25);
            System.out.println("O volume da tv está em: " + smartTv.volume + "%");
        }

    }

}
