import java.util.Stack;

public class ExemploDePilha {
    public static void main(String[] args) {
        // cria uma nova pilha
        Stack<String> pilha = new Stack<>();

        // empilha elementos na pilha
        pilha.push("elemento 1");
        pilha.push("elemento 2");
        pilha.push("elemento 3");

        // ! verifica se a pilha está vazia
        boolean vazia = pilha.isEmpty();

        // ! obtém o elemento no topo da pilha sem removê-lo
        String topo = pilha.peek();

        // ! desempilha um elemento da pilha
        String elementoDesempilhado = pilha.pop();
    }
}
