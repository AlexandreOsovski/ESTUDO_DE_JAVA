<h1>Conceito de memoria</h1>
<p>Em Java, o conceito de memória refere-se à alocação e gerenciamento de memória no sistema durante a execução de um programa Java. A memória é a área de armazenamento temporário onde os dados são mantidos enquanto um programa é executado.

A memória em Java é gerenciada pelo Garbage Collector (Coletor de Lixo), que é responsável por identificar e remover objetos não utilizados da memória para liberar espaço para novos objetos. Isso significa que, em Java, o programador não precisa se preocupar com a alocação ou desalocação de memória manualmente, pois o Garbage Collector cuida disso automaticamente.

Em Java, a memória é dividida em duas áreas principais: Heap e Stack. A Heap é a área onde os objetos são armazenados e gerenciados pelo Garbage Collector, enquanto a Stack é usada para armazenar informações de contexto de método, como parâmetros, variáveis locais e referências a objetos.

É importante que os programadores de Java entendam o conceito de memória e gerenciamento de memória em Java, pois isso pode afetar o desempenho e a eficiência do programa. O uso excessivo de memória pode levar a problemas de desempenho, como tempo de resposta lento ou falha do programa devido a esgotamento de memória. Por isso, é importante gerenciar cuidadosamente o uso da memória em programas Java.</p>

<hr>
<h1>Atribuição e Referência</h1>

<ul>
    <li>As atribuições em java são por cópia de valor sempre;</li>
    <li>Com tipos primitivos, copiamos o valor em memória;</li>
    <li>Com objetos copiamos o valor da referência em memória, sem duplicar o objeto;</li>
</ul>
<hr>
<h1>Conceito de nó e Encadeamento de nó</h1>
<p>Em Java, "nó" é um termo comumente usado em estruturas de dados como árvores e listas encadeadas. Em geral, um "nó" é um objeto que contém um ou mais campos de dados e uma ou mais referências para outros "nós".

Em uma lista encadeada, um "nó" é um objeto que contém um campo de dados e uma referência para o próximo "nó" da lista. A lista é construída conectando os "nós" por meio de suas referências.

Já em uma árvore, cada "nó" tem uma referência para seus "nós" filhos e um campo de dados. A árvore é construída conectando os "nós" por meio de suas referências.

Os "nós" são usados para representar elementos em uma estrutura de dados, e são frequentemente manipulados por meio de suas referências. A manipulação desses "nós" permite percorrer, buscar, inserir e excluir elementos de uma estrutura de dados de forma eficiente.</p>