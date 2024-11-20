   <h1>Projeto: Cálculo da Área de um Retângulo</h1>
    <h2>Descrição</h2>
    <p>
        Este projeto consiste em um programa simples em Java para calcular a área de um retângulo com base em sua 
        altura e largura fornecidas pelo usuário. O programa utiliza uma abordagem orientada a objetos, onde os 
        atributos e operações relacionadas ao cálculo da área estão encapsulados em uma classe específica.
    </p>
    <h2>Estrutura do Projeto</h2>
    <p>O projeto contém duas classes principais:</p>
    <h3>1. Main</h3>
    <p>A classe principal que contém o método <code>main</code>. Essa classe é responsável por:</p>
    <ul>
        <li>Interagir com o usuário para coletar as dimensões do retângulo (altura e largura).</li>
        <li>Instanciar um objeto da classe <code>areaRetangulo</code>, passando as dimensões fornecidas.</li>
        <li>Exibir o resultado do cálculo da área.</li>
    </ul>
    <h3>2. areaRetangulo</h3>
    <p>Essa classe encapsula os atributos e métodos relacionados ao retângulo:</p>
    <ul>
        <li><strong>Atributos:</strong></li>
        <ul>
            <li><code>altura</code> (inteiro): armazena a altura do retângulo.</li>
            <li><code>largura</code> (inteiro): armazena a largura do retângulo.</li>
        </ul>
        <li><strong>Construtor:</strong></li>
        <ul>
            <li>Inicializa os atributos <code>altura</code> e <code>largura</code> com os valores passados durante a criação do objeto.</li>
        </ul>
        <li><strong>Métodos:</strong></li>
        <ul>
            <li><code>getAltura()</code> e <code>setAltura(int altura)</code>: métodos acessores e modificadores para o atributo <code>altura</code>.</li>
            <li><code>getLargura()</code> e <code>setLargura(int largura)</code>: métodos acessores e modificadores para o atributo <code>largura</code>.</li>
            <li><code>calculo()</code>: método que retorna a área do retângulo calculada como <code>altura * largura</code>.</li>
        </ul>
    </ul>
    <h2>Funcionamento</h2>
    <p>O programa funciona da seguinte forma:</p>
    <ul>
        <li>O programa solicita ao usuário que insira os valores para a altura e a largura do retângulo.</li>
        <li>Os valores são lidos via <code>Scanner</code> e armazenados como variáveis inteiras.</li>
        <li>Um objeto da classe <code>areaRetangulo</code> é criado, inicializando os atributos com os valores fornecidos.</li>
        <li>O método <code>calculo()</code> é chamado no objeto para realizar o cálculo da área.</li>
        <li>O resultado é exibido na tela.</li>
    </ul>
   <h2>Conclusão</h2>
   <p>
        Este projeto em Java demonstra como aplicar conceitos básicos de orientação a objetos para resolver problemas do dia a dia, 
       como o cálculo da área de um retângulo. Utilizando duas classes, <code>Main</code> para interação com o usuário e 
       <code>areaRetangulo</code> para encapsular atributos e métodos relacionados ao cálculo, o programa é simples, modular e fácil de entender. 
       Com alguns aprimoramentos, ele pode servir como base para aplicações mais complexas.
   </p>
