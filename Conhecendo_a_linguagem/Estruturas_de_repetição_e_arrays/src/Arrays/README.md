<h1>Números aleatórios</h1>
  <p>Este é um programa em Java que gera 20 números inteiros aleatórios entre 0 e 100 e armazena-os em um vetor. O programa exibe os números gerados, seus antecessores e sucessores.</p>
  <h2>Código</h2>
  <p>O código Java pode ser visto abaixo:</p>
  <pre><code>
Random random = new Random();
int numerosAleatorios[] = new int[20];<br>
for (int i = 0; i &lt; numerosAleatorios.length; i++) {
    int numero = random.nextInt(100);
    numerosAleatorios[i] = numero;
}<br>
System.out.println("\n antecessores do numerosAleatorios: ");
for (int numero : numerosAleatorios) {
    System.out.print((numero - 1) + " ");
}<br>
System.out.println("\n numerosAleatorios: ");
for (int numero : numerosAleatorios) {
    System.out.print(numero + " ");
}<br>
System.out.println("\n sucessores do numerosAleatorios: ");
for (int numero : numerosAleatorios) {
    System.out.print((numero + 1) + " ");
}

</code></pre>

  <h2>Explicação</h2>
  <p>Aqui está uma explicação do código em Java:</p>
  <ol>
    <li>Importe a classe <code>Random</code> para gerar números aleatórios.</li>
    <li>Crie uma classe chamada <code>NumerosAleatorios</code>.</li>
    <li>Dentro da classe, crie o método <code>main</code>, que é o ponto de entrada do programa.</li>
    <li>Crie um objeto <code>Random</code> para gerar números aleatórios.</li>
    <li>Crie um vetor de inteiros chamado <code>numerosAleatorios</code> com tamanho 20.</li>
    <li>Use um laço <code>for</code> para preencher o vetor com números aleatórios gerados pelo objeto <code>Random</code>.</li>
    <li>Imprima os antecessores de cada número no vetor.</li>
    <li>Imprima os números armazenados no vetor.</li>
    <li>Imprima os sucessores de cada número no vetor.</li>
  </ol>

  <hr>
  <br>

  <h1>Explicação de Código - Array Multidimensional</h1>
less
Copy code
<p>Este código em Java cria e imprime uma matriz bidimensional (ou array multidimensional) de 4x4. Os elementos da matriz são preenchidos com números inteiros aleatórios entre 0 e 9.</p>

<h3>Código:</h3>
<pre><code>
Random random = new Random();<br>
int[][] Array = new int[4][4];<br>

/* 
o primeiro [] indica a linha da Matrix e o segundo [] indica a coluna
da matrix
*/<br>
    for (int i = 0; i &lt; Array.length; i++) {
        &nbsp;&nbsp;&nbsp;for (int j = 0; j &lt; Array[i].length; j++) {
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Array[i][j] = random.nextInt(9);
        &nbsp;&nbsp;}
}<br>
System.out.println("A matrix é: ");
    for (int[] linha : Array) {
        &nbsp;&nbsp;&nbsp;for (int coluna : linha) {
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;System.out.print(coluna + " ");
        &nbsp;&nbsp;}
        &nbsp;&nbsp;System.out.println("\n");
    }
</code></pre>

<h3>Explicação:</h3>
<p>Primeiro, a classe <code>Random</code> é importada para gerar números aleatórios. Em seguida, é criada a matriz com <code>int[][] Array = new int[4][4];</code> que significa que a matriz terá 4 linhas e 4 colunas. Um loop <code>for</code> aninhado é usado para percorrer cada elemento da matriz e atribuir a ele um número aleatório entre 0 e 9, utilizando o método <code>random.nextInt(9)</code>.</p>

<p>Depois que todos os elementos da matriz foram preenchidos com valores aleatórios, um segundo loop <code>for</code> é usado para imprimir a matriz, percorrendo cada linha e coluna e imprimindo o valor correspondente na posição atual com o método <code>System.out.print(coluna + " ");</code>. A cada final de linha, é usada a instrução <code>System.out.println("\n");</code> para pular uma linha e imprimir a próxima linha da matriz em uma nova linha.</p>
