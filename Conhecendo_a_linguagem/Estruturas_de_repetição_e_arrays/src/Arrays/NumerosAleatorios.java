package src.Arrays;

import java.util.Random;

//Faça um programa que leia 20 numeros inteiros aleatórios entre 0 e 100 e armazene-os num vetor
// Ao final mostre os números e seus sucessores

public class NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int numerosAleatorios[] = new int[20];

        // se colocar "<=" não vai funcionar, apenas colocar "<"

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.println("\n antecessores do numerosAleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.println("\n numerosAleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\n sucessores do numerosAleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

    }
}
