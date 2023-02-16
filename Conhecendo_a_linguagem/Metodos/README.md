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

<br><br>
 
<h1>A importância de identar um código</h1>

<p>A identação é o processo de organizar o código de programação de forma que ele fique mais legível e estruturado. Ela consiste em utilizar espaços ou tabulações para alinhar blocos de código que fazem parte da mesma estrutura, como loops, condicionais, funções e classes.</p>

<p>Identar o código não é apenas uma questão de estética, mas sim de boas práticas de programação. A identação torna o código mais fácil de ser lido, entendido e mantido por outros desenvolvedores. Quando o código é identado de forma adequada, fica mais claro para o leitor a lógica do programa, o que ajuda a evitar erros e bugs.</p>

<p>Além disso, a identação também ajuda a manter a consistência do código. Quando todos os desenvolvedores seguem as mesmas regras de identação, o código fica mais uniforme e fácil de ser mantido. Isso é especialmente importante em projetos colaborativos, em que várias pessoas trabalham no mesmo código.</p>

<p>Portanto, identar o código é uma prática fundamental para o desenvolvimento de software. Ela ajuda a garantir a legibilidade, a clareza e a consistência do código, o que é essencial para manter a qualidade do software e facilitar o trabalho em equipe.</p>

<h2>Aqui vemos a importancia de uma boa identação do código com esses dois exemplos</h2>
<code>
public static String codigoSemIdentacao(Double peso, Double altura){
String resultado;
Double resultadoImc=peso/(altura*altura);
if (resultadoImc < 19){
resultado="Seu peso está baixo";
}else if(resultadoImc>19&&resultadoImc<25){
resultado="Seu peso é ideal";
}else{
resultado="você está acima do peso";
}
return resultado;
}</code>

<code>
public static String codigoImcComIdentacao(Double peso, Double altura) {

    String resultado;
    Double resultadoImc = peso / (altura * altura);
    
    if (resultadoImc < 19) {
        resultado = "Seu peso está baixo";
    } else if (resultadoImc > 19 && resultadoImc < 25) {
        resultado = "Seu peso é ideal";
    } else {
        resultado = "você está acima do peso";
    }
    
    return resultado;
}
</code>

<p>Perceba que um código bem identado, sua leitura se torna fácil e bem intuitiva!!</p>
