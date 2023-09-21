# Exercicios de Java: Orientação a Objetos

### Não se esqueçam de salvarem esses códigos no repositório que criaram na aula 01.

### Exercício 01: Veículo

1.1 Crie uma classe abstrata chamada Veiculo com os seguintes atributos e métodos:

Atributos:
- marca (String)
- modelo (String)
- ano (int)

Métodos abstratos:
- calcularCustoViagem(int distancia): Este método deve ser abstrato e calcular o custo de uma viagem com bas e na distância fornecida.

1.2 Crie duas classes concretas que herdem de Veiculo: Carro e Moto. Implemente o método calcularCustoViagem(int distancia) em cada uma dessas classes:

- Carro deve ter um custo fixo de R$0.20 por quilômetro.
- Moto deve ter um custo fixo de R$0.15 por quilômetro.

### Exercício 02: Figuras geométricas

2.1 Crie uma classe abstrata chamada FormaGeometrica com um método abstrato calcularArea();

2.2 Crie três classes concretas que herdem de FormaGeometrica: Retangulo, Circulo, Triangulo, Quadrado e Losango. Implemente o método calcularArea() em cada uma dessas classes para calcular a área da forma específica.

2.3 Na classe Principal, crie uma lista de formas geométricas que inclua retângulos, círculos, triângulos, quadrados e losangos.

2.4 Use um loop para calcular e exibir a área de cada forma geométrica na lista, mesmo que sejam tipos diferentes, usando o polimorfismo.

### Exercício 03: Sistema de Tributação para Contas e Bens Financeiros (desafio: Interface + Herança + Polimorfismo)

Nosso banco está empenhado em aplicar tributações aos bens financeiros de nossos clientes, e para alcançar esse objetivo, estamos criando um sistema que gerenciará essa tarefa. Aqui estão as etapas do exercício:

3.1 Criação da Interface Tributavel:
Primeiramente, crie uma interface chamada Tributavel que contenha o método calculaTributos(), responsável por calcular e retornar um valor em formato double.

3.2 Tributação de Diferentes Bens Financeiros:
Alguns bens são tributáveis, enquanto outros não o são. Para exemplificar:

- Conta Poupança não é tributável, portanto, seu método calculaTributos() retornará 0.
- Conta Corrente é tributável, com uma taxa de 1% sobre o saldo da conta.
Seguro de Vida tem uma tributação fixa de 42 reais.

3.3 Hierarquia de Classes de Contas Financeiras:
As classes ContaCorrente e ContaPoupanca herdarão de uma classe-base chamada Conta. A classe Conta conterá um saldo e os métodos sacar(double), depositar(double) e obterSaldo(), que retornarão o saldo da conta.

3.4 Teste do Sistema de Tributação:
Crie uma classe chamada TestaTributavel com um método main para testar o exemplo. Neste método, você pode instanciar diferentes objetos que implementam a interface Tributavel (como contas correntes e seguros de vida) e calcular seus tributos.

3.5 Gerenciador de Imposto de Renda:
Além disso, desenvolva uma classe GerenciadorDeImpostoDeRenda que receberá todos os objetos tributáveis de uma pessoa e somará seus valores tributários. Essa classe conterá um atributo para calcular a soma total dos tributos e um método adicionar(Tributavel) que aceita objetos tributáveis como parâmetro e adiciona seus tributos ao total.

Lembre-se de que somente objetos que implementam a interface Tributavel podem ser passados para o método adicionar, excluindo qualquer tipo de conta que não seja tributável.

Tip: Você pode reaproveitar o código da aula passada nesse exercício;

### Respostas:

<details>
 <summary>Spoiler warning</summary>
  
  ![image](https://cdn.dicionariopopular.com/imagens/giphy-1.gif)

  Vocês já sabem né?

</details>

* * *
