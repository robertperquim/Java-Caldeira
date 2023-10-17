# Conceito inicial

O SQL é uma linguagem padrão para manipulação de registros em bancos de dados relacionais. A sigla SQL vem dos termos em inglês “Structured Query Language”, que podem ser traduzidos para o português como “Linguagem de Consulta Estruturada”. 

Trata-se ainda de uma linguagem declarativa que apresenta sintaxe simples e fácil de ser aprendida até por pessoas iniciantes na área da programação.


### Características

- Padronização: oferece uma ampla documentação e, aprendendo a linguagem, você vai conseguir lidar facilmente com diferentes bancos de dados que a implementam;
- Rápido acesso aos dados: SQL permite a recuperação de múltiplos registros com um único comando, tudo feito de forma rápida e eficiente;
- Portabilidade: o SQL pode ser usado em diversas aplicações para diferentes plataformas;
- Múltiplas visões de dados: com SQL é possível definir diferentes visualizações da estrutura do banco para diferentes pessoas usuárias;
- Linguagem cliente/servidor: com SQL é possível implementar arquitetura cliente-servidor.

### Quando usar

O SQL é usado para fazer qualquer tipo de manipulação dos registros de um banco de dados. Ou seja, ele serve para criar, inserir, atualizar, excluir e consultar as informações armazenadas na base, além de outras diversas funções mais complexas.

Atualmente, vários SGBDs(Sistema Gerenciador de Banco de Dados) amplamente utilizados no mercado são baseados em SQL. Isso acontece porque bancos do tipo relacional armazenam as informações em estruturas semelhantes a tabelas, permitindo que sejam criadas relações entre elas. A linguagem SQL foi criada justamente para facilitar o gerenciamento de dados armazenados em bancos que seguem esse padrão. 
Alguns dos principais sistemas que utilizam essa tecnologia são:

- MySQL: criado pela Oracle, é uma opção que oferece serviços gratuitos e pagos;
- PostgreSQL: muito usado em aplicações web, essa é uma opção gratuita de código aberto;
- Oracle: conhecido pela sua segurança, esse sistema é um dos mais usados por grandes corporações;
- SQL Server: desenvolvido pela Microsoft, ele oferece tanto serviços pagos quanto versões gratuitas para download.

### Exemplos

Segue abaixo alguns exemplos de como usar os comandos básicos do SQL:

### SQL CREATE 
O comando CREATE, conforme seu nome indica, serve para criar o banco de dados e as tabelas que ele contém. A instrução usada para isso é bem simples:

```sql
  CREATE DATABASE empresa;
  ```

Com o nosso banco criado, podemos começar a criar as tabelas em que vamos armazenar os registros. Para isso, usamos o comando CREATE TABLE, observe:

```sql
  CREATE TABLE funcionarios(id INT, nome VARCHAR(50), cargo VARCHAR(50));
  ```

É importante observar que, ao criar a tabela, também estamos especificando as colunas que ela vai conter, os tipos de dados que cada uma vai suportar e o comprimento máximo para os campos do tipo VARCHAR.

### SQL INSERT
O comando INSERT é usado para inserir novos registros em uma tabela do banco. Agora que nossa tabela “funcionarios” já foi criada, podemos usar uma estrutura básica dessa instrução para começar a popular o banco. Observe:

```sql
  INSERT INTO funcionarios (id, nome, cargo) VALUES (1, 'Fernando', 'Analista de Sistemas');
  ```

Nesse breve exemplo que mostramos, você deve reparar que “funcionarios” é o nome da tabela e “id”, “nome” e “cargo” são as colunas da tabela que estamos adicionando novos dados.

### SQL UPDATE
Já o comando UPDATE é utilizado para atualizar os registros que foram armazenados no banco. Essa declaração é usada junto com a cláusula WHERE, que especifica exatamente a linha da tabela que terá seus dados alterados.

No exemplo acima, adicionamos um novo registro na tabela “funcionarios”, mas agora queremos atualizar um dos dados que inserimos, mais precisamente o cargo que foi especificado. Para isso, usamos o comando:

```sql
UPDATE funcionarios SET cargo = 'Analista de Sistemas e Aplicações' WHERE id = 1;
```

### SQL DELETE 
O comando DELETE, como você já deve imaginar, é usado para excluir dados de uma tabela. Assim como o anterior, ele também é usado junto com a cláusula WHERE. Nesse caso, vamos imaginar que não precisamos mais das informações que inserimos nos exemplos acima e queremos apagá-las da nossa tabela. Podemos fazer isso da seguinte forma:

```sql
DELETE FROM funcionarios WHERE id = 1;
```

### SQL SELECT 
O comando SELECT permite definir critérios para realizar consultas aos registros que foram armazenados no banco de dados. Nesse caso, a forma mais simples de busca que podemos fazer é consultar todos os campos de uma tabela, dessa forma:

```sql
SELECT id, nome, cargo FROM funcionarios;
```

### Conclusões

Atualmente, a linguagem SQL é usada nas mais variadas aplicações, incluindo em sistemas de grandes empresas da tecnologia, como Google, Amazon, Uber e Netflix. Por isso, mesmo que você não vá trabalhar diretamente com bancos de dados, é bem provável que em algum momento você tenha que recuperar e manipular dados da base. Nessa hora, ter conhecimento em SQL vai fazer toda a diferença!

