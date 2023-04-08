package Filas;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("Primeiro"));
        minhaFila.enqueue(new No("Segundo"));
        minhaFila.enqueue(new No("Terceiro"));
        minhaFila.enqueue(new No("Quarto"));

        System.out.println("========== MOSTRAR TODOS OS NÓS ==========\n");
        System.out.println(minhaFila);

        System.out.println("========== RETIRA O PRIMEIRO NÓ E MOSTRA O SUCESSOR ==========\n");
        System.out.println(minhaFila.dequeue());

        System.out.println("========== MOSTRAR SEM O PRIMEIRO ==========\n");
        System.out.println(minhaFila);

        System.out.println("========== MOSTRAR A REFERENCIA DO PRIMEIRO NÓ ==========\n");
        System.out.println(minhaFila.first());


    }
}
