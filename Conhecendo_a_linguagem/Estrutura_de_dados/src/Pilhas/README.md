 <h1>Pilhas (LIFO:last in, first, out) em Java</h1>
    <p>Uma pilha em Java é uma estrutura de dados que segue o princípio LIFO (Last In First Out), o que significa que o último elemento adicionado é o primeiro a ser removido. As pilhas em Java são úteis em uma ampla variedade de situações em que a ordem em que os elementos são adicionados ou removidos é importante.</p>
    <h2>Implementação de Pilhas em Java</h2>
    <p>Em Java, as pilhas podem ser implementadas usando a classe Stack. A classe Stack é uma subclasse da classe Vector e fornece os seguintes métodos principais:</p>
    <ul>
      <li><strong>push:</strong> adiciona um elemento ao topo da pilha.</li><br>
      <li><strong>pop:</strong> remove e retorna o elemento do topo da pilha.</li><br>
      <li><strong>peek:</strong> retorna o elemento do topo da pilha sem removê-lo.</li><br>
      <li><strong>empty:</strong> retorna verdadeiro se a pilha estiver vazia, falso caso contrário.</li><br>
      <li><strong>search:</strong> retorna a posição de um elemento na pilha, contando a partir do topo da pilha. Se o elemento não estiver na pilha, retorna -1.</li><br>
    </ul>
    <p>Segue um exemplo de implementação de uma pilha em Java usando a classe Stack:</p>
<code>

    import java.util.Stack;

    Stack<Integer> pilha = new Stack<>();
    pilha.push(1);
    pilha.push(2);
    pilha.push(3);

    System.out.println(pilha); // imprime [1, 2, 3]

    int topo = pilha.pop();
    System.out.println(topo); // imprime 3
    System.out.println(pilha); // imprime [1, 2]

    topo = pilha.peek();
    System.out.println(topo); // imprime 2
    System.out.println(pilha); // imprime [1, 2]

    boolean vazia = pilha.empty();
    System.out.println(vazia); // imprime false

    int posicao = pilha.search(1);
    System.out.println(posicao); // imprime 2
    
</code>

<h2>Conclusão</h2>
<p>As pilhas em Java são uma estrutura de dados simples e poderosa que podem ser usadas em uma ampla variedade de problemas. A classe Stack fornece uma implementação conveniente e fácil de usar de uma pilha em Java.</p>