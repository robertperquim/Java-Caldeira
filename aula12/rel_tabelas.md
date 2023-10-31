# Conceito inicial
Estudamos que em um banco de dados,
precisamos de alguma maneira para representar
estes relacionamentos da vida Real, em termos
das tabelas e de seus atributos.
Isto é possível com a utilização de
"Relacionamentos entre tabelas", os quais
podem ser de três tipos:
- Um para Um
- Um para Vários
- Vários para Vários

### Características

Relacionamento **Um para UM**

- Esta relação existe quando os campos que se
relacionam são ambos do tipo Chave Primária, em
suas respectivas tabelas.
- Cada um dos campos não apresenta valores
repetidos.
- Na prática existem poucas situações onde
utilizaremos um relacionamento deste tipo.

Relacionamento **Um para Vários**

- É o tipo de relacionamento mais comum entre duas
tabelas.
- Uma das tabelas (o lado um do relacionamento)
possui um campo que é a Chave Primária e a outra
tabela (o lado vários) se relaciona através de um
campo cujos valores relacionados podem se repetir
várias vezes.

Relacionamento **Vários para Vários**

- Este tipo de relacionamento "aconteceria" em
uma situação onde os dois lados do
relacionamento, os valores poderiam se repetir.
- Vamos considerar o caso entre Produtos e
Pedidos. Posso ter Vários Pedidos nos quais
aparece um determinado produto, além disso
vários Produtos podem aparecer no mesmo
Pedido.
- Esta é uma situação em que temos um
Relacionamento do Tipo Vários para Vários.

### Quando Usar

Em um banco de dados relacional, as relações permitem que você evite dados redundantes. Por exemplo, se você está projetando um banco de dados que rastreará informações sobre livros, pode haver uma tabela chamada "Títulos" que armazena informações sobre cada livro, como o título do livro, a data de publicação e o editor. Também há informações que você pode querer armazenar sobre o editor, como o número de telefone, o endereço e o CEP/Código Postal dele. Se você armazenasse todas essas informações na tabela "Títulos", o número de telefone do editor seria duplicado para cada título impresso pelo editor.

### Exemplos

Exemplo de um relacionameto **um para um**:

Imagine uma escola com um Cadastro de Alunos na tabela
Alunos, destes apenas uma pequena parte participa da Banda
da Escola. Por questões de projeto do Banco de Dados,
podemos criar uma Segunda Tabela "Alunos da Banda", a qual
se relaciona com a tabela Alunos através de um
relacionamento do tipo Um para Um.

Cada aluno somente é cadastrado uma vez na Tabela Alunos e
uma única vez na tabela Alunos da Banda. Poderíamos utilizar
o Campo Matrícula do Aluno como o Campo que relaciona as
duas Tabelas.

<img src="https://github.com/SkiereszDiego/Java-Caldeira-Privado/blob/main/aula13/rel_1x1.png?raw=true">

E como ficaria o codígo SQL desse modelo de relacionamento (1:1)?

```sql
 CREATE TABLE Alunos
(
Matricula NUMERIC(4),
Nome CHAR(60),
Rua CHAR(60),
Primary Key(Matricula)
)
```

```sql
CREATE TABLE Alunos_Da_Banda
(
Matricula NUMERIC(4) REFERENCES Alunos(Matricula),
Instrumento CHAR(60),
Data_Ingresso DATE,
Primary Key(Matricula)
)
```

Exemplo de um relacionameto **um para varios**:

Considere o exemplo entre a tabela Clientes e
Pedidos. Cada Cliente somente é cadastrado
uma única vez na tabela de Clientes (por isso
o campo Código do Cliente, na tabela
Clientes, é uma chave primária, indicando
que não podem ser cadastrados dois clientes
com o mesmo código), portanto a tabela
Clientes será o lado um do relacionamento.
Ao mesmo tempo cada cliente pode fazer
diversos pedidos, por isso que o mesmo
Código de Cliente poderá aparecer várias
vezes na tabela Pedidos: **tantas vezes
quantos forem os pedidos que o Cliente
tiver feito**. Por isso que temos um
relacionamento do tipo Um para Vários
entre a tabela Clientes e Pedidos, através
do campo Código do Cliente, indicando que
**um mesmo Cliente pode realizar diversos
(vários) pedidos.** 

<img src="https://github.com/SkiereszDiego/Java-Caldeira-Privado/blob/main/aula13/rel_1xn.png?raw=true">

E como ficaria o codígo SQL desse modelo de relacionamento (1:N)?

```sql
CREATE TABLE Cliente
(
CPF NUMERIC(4),
Nome CHAR(60),
Telefone CHAR(15),
Email CHAR(60),
Primary Key(CPF)
)
```

```sql
CREATE TABLE Pedido
(
Numero_Pedido NUMERIC(4),
CPF NUMERIC(4) REFERENCES Cliente(CPF),
Data DATE,
Valor NUMERIC(4,
Primary Key(Numero_Pedido)
)
```
Exemplo de um relacionameto **varios para varios**:

No nosso exemplo vamos criar a tabela Detalhes do
Pedido, onde ficam armazenadas as informações
sobre os diversos itens de cada pedido, aí ao invés de
termos um relacionamento do tipo Vários para Vários,
teremos dois relacionamentos do tipo um para vários,
conforme descrito pela próxima tabela.

<img src="https://github.com/SkiereszDiego/Java-Caldeira-Privado/blob/main/aula13/rel_nxn.png?raw=true">

```sql
CREATE TABLE Produto
(
Codigo_Produto NUMERIC(4),
Descricao CHAR(60),
Valor_Unitario NUMERIC(4),
Quantidade_Estoque NUMERIC(4),
Primary Key(Codigo_Produto)
)
```

```sql
CREATE TABLE Pedido
(
Numero_Pedido NUMERIC(4),
Data DATE,
Valor NUMERIC(4,
Primary Key(Numero_Pedido)
)
```
```sql
CREATE TABLE Detalhes Pedido
(
Codigo_Produto NUMERIC(4) REFERENCES Produto(Codigo_Produto),
Numero_Pedido NUMERIC(4) REFERENCES Pedido(Codigo_Pedido),
Quantidade NUMERIC(4),
Primary Key(Codigo_Produto,Numero_Pedido)
)
```

### Conclusões

Para relacionar uma tabela com outra, precisamos apenas que a chave primária de uma esteja presente como chave externa na outra. Relacionar tabelas pode ser muito útil, no sentido em que se torna possível, por exemplo: Saber a Localidade de um Distribuidor, mesmo sendo a Localidade um campo da tabela Códigos Postais.
