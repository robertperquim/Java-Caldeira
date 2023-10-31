# Conceito inicial

PostgreSQL é um sistema gerenciador de banco de dados objeto-relacional baseado no POSTGRES, Versão 4.2, desenvolvido na Universidade da Califórnia no Departamento de Ciências da Computação em Berkeley, o qual foi pioneiro em muitos conceitos que vieram a estar disponíveis em alguns bancos de dados comerciais mais tarde.

O PostgreSQL é um descendente open-source do código original de Berkeley code.

O PostgreSQL é um banco de dados objeto-relacional (sem relação com linguagens de programação orientadas a objetos), em que cada coisa criada é tratada como um objeto, tais como bancos de dados, tabelas, views, triggers, etc.


### Características

- Consultas complexas;
- Chaves estrangeiras (foreign keys);
- Gatilhos (triggers);
- Visões (views);
- Integridade transacional.

### Quando usar

Muitas startups e grandes empresas utilizam o PostgreSQL como a principal solução de armazenamento de dados para produtos, soluções e aplicativos em escala de internet. O desempenho da cadeia de suprimentos pode ser otimizado usando este SGBD de código aberto como um backend de armazenamento. Como resultado, isto permite que as empresas reduzam o custo de operação de seus negócios.


### Exemplos

Veja abaixo alguns exemplos simples do uso do Postgres

## CREATE DATABASE

Cria um novo banco de dados PostgreSQL.

Para criar um banco de dados, você deve ser um superusuário ou ter o privilégio especial CREATEDB. Veja o comando CREATE USER.

Por padrão, o novo banco de dados será criado clonando o modelo de banco de dados de sistema template1. Um modelo diferente pode ser especificado escrevendo o nome do TEMPLATE. Em particular, ao escrever o TEMPLATE0 template0, você pode criar um banco de dados virgem contendo apenas os objetos padrão predefinidos pela sua versão do PostgreSQL. Isso é útil se você desejar evitar a cópia de qualquer objeto local de instalação que possa ter sido incluído no template1.

```sql
  CREATE DATABASE empresa;CREATE DATABASE name
    [ [ WITH ] [ OWNER [=] user_name ]
           [ TEMPLATE [=] template ]
           [ ENCODING [=] encoding ]
           [ LC_COLLATE [=] lc_collate ]
           [ LC_CTYPE [=] lc_ctype ]
           [ TABLESPACE [=] tablespace ]
           [ CONNECTION LIMIT [=] connlimit ] ]
  ```
## Parâmetros

- name: O nome de um banco de dados para criar.
- user_name: O nome da função do usuário que possuirá o novo banco de dados, ou DEFAULT para usar o padrão (ou seja, o usuário que está executando o comando). Para criar um banco de dados de propriedade de outra função, você deve ser um membro direto ou indireto dessa função ou ser um superusuário.
- template: O nome do template a partir do qual criar o novo banco de dados, ou DEFAULT para usar o template padrão (template1).
- encoding:Codificação do conjunto de caracteres para usar no novo banco de dados. Especifique uma constante de cadeia (por exemplo, 'SQL_ASCII'), ou um número de codificação de inteiro, ou DEFAULT para usar a codificação padrão (ou seja, a codificação do banco de dados de modelo).
- lc_collate: Ordem de agrupamento (LC_COLLATE) para usar no novo banco de dados. Isso afeta a ordem de classificação aplicada às strings, por exemplo, em consultas com ORDER BY, bem como a ordem usada em índices em colunas de texto. O padrão é usar a ordem de agrupamento do banco de dados de modelos.
- lc_ctype: Classificação de caracteres (LC_CTYPE) para usar no novo banco de dados. Isso afeta a categorização de caracteres, por ex. inferior, superior e dígito. O padrão é usar a classificação de caracteres do banco de dados de modelos. Veja abaixo as restrições adicionais.
- tablespace: O nome do espaço de tabela que será associado ao novo banco de dados, ou DEFAULT para usar o espaço de tabela do banco de dados de modelo. Esse espaço de tabela será o espaço de tabela padrão usado para objetos criados neste banco de dados. Veja CREATE TABLESPACE para mais informações.
- connlimit: Quantas conexões simultâneas podem ser feitas neste banco de dados. -1 (o padrão) significa sem limite.

Parâmetros opcionais podem ser escritos em qualquer ordem, não apenas na ordem ilustrada acima.

## CREATE USER

Define uma nova conta de usuário do banco de dados.

O CREATE USER adiciona um novo usuário a um cluster de banco de dados do PostgreSQL. Você deve ser um superusuário do banco de dados para usar este comando.

```sql
CREATE USER name [ [ WITH ] option [ ... ] ]

where option can be:

      SYSID uid
    | CREATEDB | NOCREATEDB
    | CREATEUSER | NOCREATEUSER
    | IN GROUP groupname [, ...]
    | [ ENCRYPTED | UNENCRYPTED ] PASSWORD 'password'
    | VALID UNTIL 'abstime'
  ```
## Parâmetros

- name: O nome do novo usuário.
- uid: A cláusula SYSID pode ser usada para escolher o ID do usuário do PostgreSQL do novo usuário. Isso normalmente não é necessário, mas pode ser útil se você precisar recriar o proprietário de um objeto órfão.

Se isso não for especificado, o ID do usuário atribuído mais alto mais um (com um mínimo de 100) será usado como padrão.


### Conclusões

O PostgreSQL pode ser um sistema realmente útil para gerenciar bancos de dados de aplicações diversas. Não há dificuldades em saber usá-los, assim como a instalação é também simples. Há ótimas vantagens que justificam o motivo pelo qual essa é uma ferramenta de destaque.


