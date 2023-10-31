# Conceito inicial

## Chave primária

A chave primária, ou primary key, é o conceito mais básico relacionado à organização em um banco de dados. Toda tabela possuirá uma, e somente uma, chave primária. Essa chave é utilizada como identificador único da tabela, sendo representada por aquele campo (ou campos) que não receberá valores repetidos.

## Chave estrangeira

A chave estrangeira, ou foreign key, é um conceito ligeiramente diferente. Ela não diz respeito, especificamente, a uma tabela, mas sim a um relacionamento entre tabelas. De forma sucinta, a chave estrangeira é uma referência em uma tabela a uma chave primária de outra tabela. Para facilitar a compreensão, tomemos como exemplo duas tabelas: Pessoa e Carro. Para montarmos um relacionamento entre elas poderíamos ter na tabela Carro o campo ID_Pessoa fazendo referência à chave primária da tabela Pessoa.


### Características

## Chave primária

- Chaves primárias não podem ser nulas;
- Cada registro na tabela deve possuir uma, e somente uma, chave primária;
- Normalmente, chaves primárias são incrementadas automaticamente pelo banco de dados, ou seja, não há necessidade de passarmos esse valor em um INSERT. Entretanto, essa é uma opção configurada na criação da base de dados que não é obrigatória. Nos casos em que ela (incremento automático) não é definida, é preciso garantir que não haverá valores repetidos nessa coluna;
- São as chaves para o relacionamento entre entidades ou tabelas da base de dados. Assim haverá na tabela relacionada uma referência a essa chave primária (que será, na tabela relacionada, a chave estrangeira).

## Chave estrangeira

Diferentemente da chave primária, a chave estrangeira:

- Pode ser nula (NOT NULL);
- É um campo em uma tabela que faz referência a um campo que é chave primária em outra tabela;
- É possível ter mais de uma (ou nenhuma) em uma tabela.

Um alerta: embora não haja, efetivamente, nenhum problema das chaves estrangeiras aceitarem o valor null, tal característica pode gerar o que é chamado de registro órfão, isto é, um registro sem dados para um determinado relacionamento. Por exemplo, um registro de Pessoa que não possui Carro. Embora comum na realidade, é preciso levar em consideração essa regra de negócio na aplicação para evitar problemas.

### Quando usar

A Linguagem SQL traz muitos conceitos importantes. Entre eles, os conceitos de chave primária e chave estrangeira. Tais opções são essenciais para definirmos, principalmente, os relacionamentos entre as entidades de uma base de dados. 

### Exemplos

### Chave Primária

Para criarmos uma chave primária precisamos de um código como o mostrado abaixo que chamaremos de <Listagem 1>.

```sql
 CREATE TABLE Pessoa
(
    ID_Pessoa integer PRIMARY KEY AUTOINCREMENT,
    Nome varchar(255),
    Endereco varchar(255),
    Cidade varchar(255)
);
  ```
<Listagem 1>. Gerando tabela Pessoa com chave primária com auto incremento 

- Linha 01: comando SQL para criação da tabela Pessoa na base de dados. Quando executado, criará a tabela com os campos definidos nas linhas 03 a 06;
- Linha 03: campo ID_Pessoa da tabela. Gera um campo de valores inteiros (integer), com uma constraint PRIMARY KEY que indica que esse campo é a chave primária da tabela. Note ainda que o definimos como sendo de autoincremento (AUTOINCREMENT);
- Linhas 04 a 06: definição dos demais campos da tabela Pessoa.

Vale ressaltar que a chave primária é essencial para o funcionamento da base de dados, representando um registro único que facilita buscas e garante que cada valor dentro da tabela será diferente do outro.

### Chave Estrangeira

A criação de chaves estrangeiras em uma tabela se dá de duas formas: a <Listagem 2> mostra a adição da chave estrangeira diretamente quando criamos a tabela, enquanto na <Listagem 3> vemos a utilização do comando ALTER TABLE para inserir essa constraint em uma tabela já existente.


```sql
CREATE TABLE Carro
(
    ID_Carro integer PRIMARY KEY AUTOINCREMENT,
    Nome varchar(255),
    Marca varchar(255),
    ID_Pessoa integer,
    CONSTRAINT fk_PesCarro FOREIGN KEY (ID_Pessoa) REFERENCES Pessoa (ID_Pessoa)
); 
```
<Listagem 2>. Chave estrangeira especificada no CREATE TABLE

- Linha 01: comando SQL para criação da tabela Carro na base de dados. Quando executado criará a tabela com os campos definidos nas linhas 03 a 07;
- Linha 03: gera a chave primária da tabela Carro, incluindo auto incremento, da mesma forma que vimos para a tabela Pessoa;
- Linhas 04 e 05: inserção dos campos Nome e Marca do Carro na tabela;
- Linha 06: criação do campo ID_Pessoa, do tipo inteiro (integer). Esse campo representa a chave estrangeira e, portanto, receberá o valor do campo ID_Pessoa (a chave primária) da Pessoa “dona” do Carro, na modelagem de nossa base de dados exemplo;
- Linha 07: definição da chave estrangeira propriamente dita. Para isso, observe que adicionamos uma constraint chamada fk_PesCarro (nome padrão: misto dos nomes das tabelas relacionadas com o prefixo fk) como uma FOREIGN KEY (chave estrangeira) e a associamos ao campo ID_Pessoa da tabela Carro. Ainda na mesma linha, definimos a referência propriamente dita (palavra-chave REFERENCES) à tabela Pessoa, especificamente ao campo ID_Pessoa da tabela Pessoa.

```sql
 CREATE TABLE Carro
 (
     ID_Carro integer PRIMARY KEY AUTOINCREMENT,
     Nome varchar(255),
     Marca varchar(255),
     ID_Pessoa integer,
 );

 ALTER TABLE Carro
 ADD CONSTRAINT fk_PesCarro FOREIGN KEY (ID_Pessoa) REFERENCES Pessoa (ID_Pessoa)
```
<Listagem 3>. Chave estrangeira adicionada com o comando ALTER TABLE

- Linhas 01 a 07: comando para criação da tabela Carro sem a definição da chave estrangeira;
- Linhas 09 e 10: comando para alterar a tabela Carro para adição da constraint do tipo chave estrangeira;
- Linha 10: comando para adição da constraint com nome “fk_PesCarro, do tipo FOREIGN KEY, para o campo ID_Pessoa da tabela Carro. Observe também a referência (palavra-chave REFERENCES) ao campo ID_Pessoa da tabela Pessoa.

Os comandos das Listagens 2 e 3 fazem a mesma coisa, mas por caminhos diferentes. A chave estrangeira gerada é a mesma, bem como o relacionamento entre as tabelas Pessoa e Carro.

### Conclusões

Um ponto digno de nota é que tanto as chaves estrangeiras quanto as chaves primárias podem ser compostas, ou seja, envolverem mais de um campo da tabela. Esse tipo de situação, no entanto, não é muito comum, pois prejudica principalmente a performance do acesso aos dados através de comandos SELECTs.

