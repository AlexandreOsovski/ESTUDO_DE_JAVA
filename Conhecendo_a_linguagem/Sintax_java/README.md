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

	<p>O tipo "final" determina que aquela variável nunca pode mudar.</p>

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
	String nomeCompleto = "Alexandre";
	int idade = 10;
</pre>

<p>Não é recomendado usar nomes de variáveis que sejam iguais a palavras-chave da linguagem, como no exemplo acima onde "String" e "Int" foram usados como nomes de variáveis.</
