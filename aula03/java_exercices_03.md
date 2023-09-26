# Exercicios de Java: Orientação a Objetos

### Não se esqueçam de salvarem esses códigos no repositório que criaram na aula 01.

### Exercício 01: Conta Bancária

Crie uma classe `ContaBancaria` com os atributos:

- `nome` (nome do titular da conta)
- `cpf` (número de CPF do titular)
- `identificadorConta` (número de identificação da conta)
- `banco` (nome do banco)
- `endereco` (endereço do titular)
- `saldo` (saldo disponível na conta)
- `horarioAtual` (um atributo para armazenar o horário atual)

Implemente os seguintes métodos na classe:

1. `saque(double valor)`: Realiza um saque da conta, desde que o saldo seja suficiente. Caso contrário, exibe uma mensagem de erro.

2. `deposito(double valor)`: Realiza um depósito na conta, atualizando o saldo.

3. `pix(double valor)`: Realiza uma transferência PIX. Caso contrário, exibe uma mensagem de erro.

4. `transferencia(ContaBancaria destino, double valor)`: Realiza uma transferência para outra conta bancária, verificando se o horário atual está dentro do intervalo permitido (8hrs às 19hrs) e se o saldo é suficiente. Caso contrário, exibe uma mensagem de erro.

5. `verificarSaldo()`: Exibe o saldo atual da conta.

6. `verificarHorario()`: Exibe o horário atual.

7. `verificarInformacoes()`: Exibe todas as informações da conta bancária, como nome, CPF, saldo, etc.

#### Tarefas adicionais:

8. Implemente uma validação no método `cpf` para garantir que o CPF seja um número válido.

9. Adicione um histórico de transações na conta bancária, registrando todas as operações de saque, depósito, PIX e transferência. Crie um método para exibir o histórico de transações.

10. Crie um construtor para a classe que permita inicializar os atributos iniciais da conta bancária.

11. Implemente um método `alterarEndereco(String novoEndereco)` para atualizar o endereço do titular da conta.

12. Adicione uma taxa de manutenção mensal à conta bancária, que seja deduzida automaticamente do saldo no primeiro dia de cada mês.

13. Crie um método `calcularJuros(double taxa)` que calcule juros sobre o saldo da conta e os adicione mensalmente.

14. Implemente um método `fecharConta()` que encerre a conta, zerando o saldo e não permitindo mais operações.
    
### Exercício 2: Círculo

Crie uma classe chamada `Circulo` com os seguintes atributos:

- `raio` (representando o raio do círculo)

Implemente os seguintes métodos na classe:

1. `calcularArea()`: Este método deve calcular a área do círculo com base no raio e retornar o resultado.

2. `calcularCircunferencia()`: Este método deve calcular a circunferência do círculo com base no raio e retornar o resultado.

Crie objetos da classe `Circulo` e utilize os métodos para calcular e exibir os resultados.

#### Tarefas adicionais:

3. Implemente um método `definirRaio(double novoRaio)` que permita alterar o raio do círculo.

4. Adicione validações nos métodos para garantir que o raio seja sempre um valor positivo.

5. Crie um construtor para a classe que permita inicializar o raio ao criar um objeto.

6. Implemente um método `toString()` que retorne uma representação em texto do círculo, incluindo o raio, a área e a circunferência.

7. Adicione um método para verificar se dois círculos são iguais, ou seja, se têm o mesmo raio.

8. Crie um método para calcular o diâmetro do círculo.

9. Implemente um método para calcular a área sombreada entre dois círculos concêntricos de diferentes raios.

10. Adicione a capacidade de criar um círculo a partir de um ponto no plano cartesiano (coordenadas x, y) e um raio.

### Respostas:

<details>
 <summary>Spoiler warning</summary>
  
  ![image](https://media.tenor.com/uATlxJ4eqLsAAAAC/tommy-wiseau-oh-hi-mark.gif)

  Não tão rápido, vamos codar primeiro e quando chegarmos na próxima aula, vamos apresentar as respostas.

</details>

* * *
