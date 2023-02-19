<h1>Atividade SmartTv</h1>
<ul>
    <li>Caracteristicas: ligada (boolean), canal(int), volume(int)</li>
    <li>Nossa Tv poderá ligar e desligar, e assim mudar o estado ligada</li>
    <li>Nossa Tv aumentará e diminuirá o volume sempre em +1 ou -1</li>
    <li>Nossa Tv poderá mudar o canal de 1 em 1 ou definindo o número correspondente</li>
</ul>
<hr>
<br>

<h1>Desenvolvimento da atividade</h1>


<h2>- Class SmartTv</h2>
<p>Esse código é uma classe Java chamada "SmartTv", que define os comportamentos de uma TV inteligente. Ela possui três atributos: "ligada", "canal" e "volume", que são inicializados com valores padrão. Em seguida, são definidos diversos métodos para manipular esses atributos.</p>

<pre><code>public class SmartTv {
    boolean ligada = false;
    int canal = 0;
    int volume = 12;
    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarVolume() {
        volume++;
    }
    public void baixarVolume() {
        volume--;
    }
    public void mudarVolume(int novoVolume) {
        volume = novoVolume;
    }
}
</code>
</pre>



<p>Os métodos "ligar" e "desligar" alteram o valor do atributo "ligada", tornando-o verdadeiro ou falso, respectivamente. 
<pre><code>public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }</code></pre>



<p>Os métodos "aumentarCanal" e "diminuirCanal" incrementam ou decrementam o valor do atributo "canal", respectivamente.</p>

<pre><code>public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }</code></pre>

<p>O método "mudarCanal" permite que o usuário especifique um novo valor para o atributo "canal".</p>

<pre><code>public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }</code></pre>



<p>Os métodos "aumentarVolume" e "baixarVolume" incrementam ou decrementam o valor do atributo "volume", respectivamente.</p> 

<pre><code>public void aumentarVolume() {
        volume++;
    }
    public void baixarVolume() {
        volume--;
    }</code></pre>


<p>O método "mudarVolume" permite que o usuário especifique um novo valor para o atributo "volume".</p>

<pre><code>
public void mudarVolume(int novoVolume) {
        volume = novoVolume;
    }
</code></pre>

<hr>
<br>


<h2> - Class Usuario</h2>

<pre><code>public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        if (smartTv.ligada == false) {
            System.out.println("A Tv está Desligada");

        } else {

            System.out.println("A Tv está ligada");

            smartTv.mudarCanal(12);
            System.out.println("O canal da tv está no: " + smartTv.canal);

            smartTv.mudarVolume(25);
            System.out.println("O volume da tv está em: " + smartTv.volume + "%");
        }

    }

}</code></pre>

<p>Esse código Java define uma classe chamada "Usuario" que contém o método principal "main". O programa cria uma instância de outra classe chamada "SmartTv" e realiza algumas operações nela</p>
<p>O método "main" começa criando uma nova instância de "SmartTv" usando a linha:</p>

<pre><code>SmartTv smartTv = new SmartTv();
</code></pre>

<p>Em seguida, o programa chama o método "ligar" do objeto "smartTv" usando a linha:</p>
<pre><code>smartTv.ligar();</code></pre>

<p>Se a TV estiver desligada, o programa exibe uma mensagem na saída padrão usando a linha:</p>
<pre><code>System.out.println("A Tv está Desligada");</code></pre>
<p>Caso contrário, o programa exibe informações sobre o canal e o volume da TV. Primeiro, ele muda o canal para o canal 12 usando a linha:</p>

<pre><code>smartTv.mudarCanal(12); 
</code></pre>

<p>Em seguida, ele exibe o número do canal atual usando a linha:</p>
<pre><code>System.out.println("O canal da tv está no: " + smartTv.canal);</code></pre>
<p>Depois, ele define o volume da TV em 25% usando a linha:</p>
<pre><code>smartTv.mudarVolume(25);</code></pre>
<p>E, em seguida, exibe o nível de volume atual usando a linha:</p>
<pre><code>System.out.println("O volume da tv está em: " + smartTv.volume + "%");</code></pre>
<p>Em resumo, este código simula algumas operações em uma TV inteligente, como ligá-la, mudar o canal e ajustar o volume, e exibe informações relevantes sobre o estado atual da TV.</p>
