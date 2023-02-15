<h1>Métodos em Java</h1>

<p>Os métodos em Java são blocos de código que realizam tarefas específicas e que podem ser chamados e executados várias vezes durante a execução de um programa. Em geral, um método é definido com um nome, um tipo de retorno (se houver) e uma lista de parâmetros.</p>

<h2>Estrutura de um método em Java</h2>

<p>A estrutura básica de um método em Java é a seguinte:</p>

<pre><code>&lt;modificador&gt; &lt;tipo de retorno&gt; &lt;nome do método&gt; (&lt;lista de parâmetros&gt;) {
    // corpo do método
}</code></pre>

<p>Os elementos que compõem um método são:</p>

<ul>
	<li>Modificador: é uma palavra-chave que define a visibilidade e acessibilidade do método. Os modificadores mais comuns são public, private e protected.</li>
	<li>Tipo de retorno: é o tipo de dado que o método retorna. Se o método não retornar nenhum valor, o tipo de retorno deve ser void.</li>
	<li>Nome do método: é o identificador do método, que deve ser único dentro da classe.</li>
	<li>Lista de parâmetros: são os dados que o método recebe como entrada. Os parâmetros são separados por vírgulas e são compostos pelo tipo de dado e pelo nome do parâmetro.</li>
	<li>Corpo do método: é o bloco de código que contém as instruções que serão executadas quando o método for chamado.</li>
</ul>

<h2>Exemplo de método em Java</h2>

<p>A seguir, é apresentado um exemplo de método em Java que recebe duas Strings como parâmetros e retorna a concatenação dessas Strings:</p>

<pre><code>public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // return primeiroNome + " " + segundoNome;
        return primeiroNome.concat(" ").concat(segundoNome);
    }</code></pre>

<p>Nesse exemplo, o método é público (public), retorna um valor do tipo String, tem o nome "nomeCompleto", recebe dois parâmetros do tipo String (primeiroNome e segundoNome) e retorna a concatenação desses parâmetros usando a palavra chave do java (.concat). Se usássemos o "+" para concatenar, também funcionaria perfeitamente como no exemplo comentado.</p>

<h2>Chamando um método em Java</h2>

<p>Para chamar um método em Java, basta utilizar o nome do método seguido da lista de argumentos entre parênteses. Por exemplo:</p>

<pre><code>
String primeiroNome;
String segundoNome;

primeiroNome = "Alexandre";
segundoNome = "Osovski";

String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
System.out.println(nomeCompleto);

//Retorna "Alexandre Osovski"

</code></pre>

<p>Nesse exemplo, o método nomeCompleto é chamado com os argumentos primeiroNome e segundoNome, e o resultado é atribuído à variável nomeCompleto.</p>
