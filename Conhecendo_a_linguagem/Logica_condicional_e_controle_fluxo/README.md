<h1>Operadores Relacionais em Java</h1>
  <p>Os operadores relacionais em Java permitem que você compare valores e realize verificações de igualdade ou
    diferença.</p>
  <h2>Operadores Relacionais Disponíveis em Java</h2>
  <ul>
    <li><code>==</code> - Igual a (veja que possuem DOIS iguais "==", apenas UM igual "=" significa atribuição)</li>
    <li><code>!=</code> - Diferente de</li>
    <li><code><></code> - Diferente de (Esse é menos comun de ser usado, mas funciona igual ao "!=")</li>
    <li><code>&gt;</code> - Maior que</li>
    <li><code>&gt;=</code> - Maior ou igual a</li>
    <li><code>&lt;</code> - Menor que</li>
    <li><code>&lt;=</code> - Menor ou igual a</li>
  </ul>
  <h2>Exemplos de Uso</h2>
  <p>Aqui estão alguns exemplos de como os operadores relacionais podem ser usados em Java:</p>
  <pre><code>
// Verificando se um valor é igual a outro
int x = 5;
int y = 5;
if (x == y) {
  System.out.println("x é igual a y");
}

// Verificando se um valor é diferente de outro
int a = 10;
int b = 20;
if (a != b) {
System.out.println("a é diferente de b");
}

// Verificando se um valor é maior que outro
int c = 15;
int d = 10;
if (c &gt; d) {
System.out.println("c é maior que d");
}

// Verificando se um valor é menor ou igual a outro
int e = 5;
int f = 5;
if (e &lt;= f) {
System.out.println("e é menor ou igual a f");
}</code></pre>


<h2>Podemos usar métodos para que seja feita a verificação</h2>
<p>Primeiramente criamos o método com dois parâmetros int (poderia ser float também) e fazemos a comparação entre os parâmentros para determinar qual das mensagem vai aparecer.</p>
<p>Exemplo</p>
<pre><code>
public static String verificarValores(int valorUm, int valorDois) {
        String resposta;
        if (valorUm < valorDois) {
            resposta = "valorUm é menor que valorDois";
        } else if (valorUm == valorDois) {
            resposta = "valorUm é igual a valorDois";
        } else {
            resposta = "valorUm é maior que valorDois";
        }
        return resposta;
    }</code></pre>

<p>Em seguida, chamamos esse método na classe principal</p>
<pre><code>
int valorUm = 10;
int valorDois = 10;
String resultadoValores = verificarValores(valorUm, valorDois);
System.out.println(resultadoValores);</code></pre>


  <h2>Dica</h2>
  <p>Lembre-se de que os operadores relacionais em Java sempre retornam um valor booleano (<code>true</code> ou
    <code>false</code>), então você geralmente usará esses operadores em instruções de controle de fluxo condicionais,
    como <code>if</code> ou <code>while</code>.</
