 <h1>Variáveis e Constantes em Programação</h1>
    <p>Em programação, variáveis e constantes são elementos fundamentais para armazenar e manipular dados em um programa.</p>
    <h2>Variáveis</h2>
    <p>Uma variável é um espaço reservado na memória para armazenar dados que podem mudar ao longo da execução do programa. Em outras palavras, é um valor que pode ser alterado em tempo de execução.</p>
    <p>A declaração de uma variável envolve especificar seu nome e tipo de dados que ela pode armazenar. Por exemplo, uma variável "idade" pode ser do tipo inteiro e armazenar valores inteiros como 18, 20, 30 etc.</p>
    <p>Exemplo de declaração de uma variável em Java:</p>
    <pre><code>int idade = 20;</code></pre>
    <h2>Constantes</h2>
    <p>Uma constante, por outro lado, é um valor que é atribuído apenas uma vez e não pode ser alterado durante a execução do programa. É um valor fixo que não muda.</p>
    <p>A declaração de uma constante envolve especificar seu nome e valor inicial. Por convenção, as constantes são escritas em letras maiúsculas.</p>
    <p>Exemplo de declaração de uma constante em Java:</p>
    <pre><code>final double PI = 3.14159;</code></pre>
    <p>O uso de constantes pode tornar o código mais fácil de entender, pois permite a atribuição de um valor que não muda durante todo o programa.</p>
    <h2>Diferenças entre Variáveis e Constantes</h2>
    <p>A principal diferença entre variáveis e constantes é que variáveis armazenam valores que podem mudar ao longo da execução do programa, enquanto as constantes armazenam valores que permanecem inalterados durante a execução do programa.</p>
    <p>Outra diferença importante é que variáveis podem ser declaradas sem um valor inicial, mas isso não é permitido para constantes.</p>
    <p>Em resumo, variáveis são usadas para armazenar valores que podem mudar durante a execução do programa, enquanto constantes são usadas para armazenar valores fixos que não mudam.</p>
<hr><br>

<h1>Tipos Primitivos de Variáveis em Java</h1>
<p>Java é uma linguagem de programação fortemente tipada, o que significa que todas as variáveis devem ser declaradas com um tipo específico antes de serem usadas. Existem oito tipos primitivos em Java, que são divididos em quatro categorias: numéricos, lógicos, caractere e cadeia de caracteres.</p>
<h2>Tipos Numéricos</h2>
<p>Os tipos numéricos em Java são usados para armazenar valores numéricos. Existem quatro tipos numéricos em Java:</p>
<ul>
    <li><code>byte</code>: representa um valor numérico de 8 bits e é usado quando o espaço em memória é uma preocupação.</li>
    <li><code>short</code>: representa um valor numérico de 16 bits.</li>
    <li><code>int</code>: representa um valor numérico de 32 bits e é o tipo numérico mais comumente usado.</li>
    <li><code>long</code>: representa um valor numérico de 64 bits.</li>
</ul>
<h2>Tipos Lógicos</h2>
<p>Os tipos lógicos em Java são usados para armazenar valores booleanos. Existem dois tipos lógicos em Java:</p>
<ul>
    <li><code>boolean</code>: representa um valor booleano, que pode ser verdadeiro (<code>true</code>) ou falso (<code>false</code>).</li>
</ul>
<h2>Tipo Caractere</h2>
<p>O tipo caractere em Java é usado para armazenar um único caractere. O tipo caractere em Java é representado pelo tipo <code>char</code>.</p>
<h2>Tipo Cadeia de Caracteres</h2>
<p>O tipo cadeia de caracteres em Java é usado para armazenar uma sequência de caracteres. O tipo cadeia de caracteres em Java é representado pelo tipo <code>String</code>.</p>

<hr><br>


<h1>Variáveis em Java</h1>
<p>Este documento descreve as boas práticas para declaração de variáveis em Java.</p>
<br>

<h2>Estrutura de uma variável em Java</h2>
<p>As variáveis em Java possuem a seguinte estrutura:</p>

<pre>
Tipo nomeBemDefinido = Atribuicao;
</pre>

<p>Onde:</p>
<ul>
<li><em>Tipo</em> -> pode ser String, int, float, boolean e double, dentre outros;</li>
<li><em>nomeBemDefinido</em> -> deve ser um nome que represente o valor da variável;</li>
<li><em>Atribuicao</em> -> é opcional em alguns casos.</li>
</ul>

<p>Exemplo:</p>

<pre>
String nomeCompleto = "Alexandre Osovski";
</pre>

<p>O exemplo acima obedeceu a estrutura, pois possui um tipo (String), possui um nome bem definido (nomeCompleto), e possui uma atribuição também (Alexandre Osovski).</p>

<p>As variáveis em Java devem ser escritas no padrão camelCase caso sejam compostas, exemplo:</p>

<pre>
String nomeCompleto = "Alexandre Osovski";
</pre>

<p>Caso a variável não possua nome composto, sua primeira letra precisa necessariamente ser com a letra minúscula.</p>

<h2>Variáveis Fixas</h2>
<p>Se uma variável for fixa e nunca mudar podemos usar duas coisas ao nosso favor:</p>

<ol>
<li>Exemplo:</li>
</ol>
<pre>
String BRASIL = "Brasil";
</pre>

<p>Podemos deixar a variável com as letras todas maiúsculas, isso indica que nunca deve mudar a atribuição dela.</p>
<ol>
<li>Exemplo:</li>
</ol>
<pre>
final String brasil = "Brasil";
</pre>
<ol>
<li>O tipo "final" determina que aquela variável nunca pode mudar.</li>
</ol>

<h2>Regras para nomear uma variável</h2>
<p>Uma variável em Java pode conter apenas letras, underline, $ ou números de 0 a 9. Algumas regras para nomear variáveis em Java são:</p>

<ul>
<li>Obrigatoriamente iniciar com uma letra, underline ou $, jamais adicionar números ou qualquer outro caracter que não seja $.</li>
<li>Deve iniciar com uma letra minúscula (boa prática).</li>
<li>Não deve conter espaços.</li>
<li>Nome único dentro de um escopo.</li>
<li>Não usar palavras-chave da linguagem.</li>
</ul>

<p>Exemplo:</p>

<pre>
String String = "Alexandre";
int int = 10;
</pre>

<p>Não usar nomes de variáveis que sejam iguais a palavras-chave da linguagem, como no exemplo acima onde "String" e "Int" foram usados como nomes de variáveis.</p>
<hr><br>
