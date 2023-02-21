<h1>Estruturas de Repetição e Arrays em Java</h1>
	<p>Neste documento, vamos discutir as estruturas de repetição e arrays em Java e como elas podem ser usadas para criar programas eficientes e escaláveis.</p>

<h2>Estruturas de Repetição</h2>
<p>As estruturas de repetição, também conhecidas como loops, permitem que você execute um bloco de código repetidamente. Em Java, existem três tipos principais de loops:</p>
<ul>
	<li><code>for</code>: é usado quando você sabe exatamente quantas vezes deseja executar um loop.</li>
	<li><code>while</code>: é usado quando você não sabe exatamente quantas vezes deseja executar um loop, mas sabe a condição que deve ser satisfeita para continuar o loop.</li>
	<li><code>do-while</code>: semelhante ao <code>while</code>, mas a condição é verificada após a execução do bloco de código.</li>
</ul>

<p>Aqui está um exemplo de como usar a estrutura de repetição <code>for</code> para exibir os números de 1 a 10:</p>
<pre><code>for (int i = 1; i &lt;= 10; i++) {
System.out.println(i);</code></pre>

<h2>Arrays</h2>
<p>Arrays são estruturas de dados que permitem armazenar um conjunto de valores do mesmo tipo. Em Java, os arrays podem ser de qualquer tipo, incluindo tipos primitivos, como int e double, ou objetos.</p>

<p>Para declarar um array em Java, você precisa especificar o tipo de dados e o tamanho do array. Aqui está um exemplo de como declarar um array de inteiros com tamanho 5:</p>
<pre><code>int[] numeros = new int[5];</code></pre>

<p>Você pode acessar os elementos individuais de um array usando seu índice. O primeiro elemento de um array tem índice 0, o segundo elemento tem índice 1 e assim por diante. Aqui está um exemplo de como acessar o terceiro elemento de um array:</p>
<pre><code>int[] numeros = {1, 2, 3, 4, 5};
int terceiroNumero = numeros[2];</code></pre>

<p>Você também pode percorrer todos os elementos de um array usando uma estrutura de repetição. Aqui está um exemplo de como exibir todos os elementos de um array:</p>
<pre><code>int[] numeros = {1, 2, 3, 4, 5};
for (int i = 0; i < numeros.length; i++) {
System.out.println(numeros[i]);
}</code></pre>

<h2>Conclusão</h2>
<p>Estruturas de repetição e arrays são recursos poderosos em Java que podem ajudar a simplificar e otimizar o código. Com as estruturas de repetição, você pode executar um bloco de código várias vezes, enquanto os arrays permitem armazenar e manipular conjuntos de valores do mesmo



