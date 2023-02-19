package com.estudos.metodos.atividade_orientacao_objetos;

public class SmartTv {

    boolean ligada;

    int canal;
    int volume;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void baixarVolume() {
        volume--;
    }

    public void mudarVolume(int novoVolume) {
        volume = novoVolume;
    }

}
