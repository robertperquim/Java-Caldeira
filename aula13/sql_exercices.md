# Exercicios de SQL

:warning: Te liga! Primeiro você precisa ter o banco instalado, caso não tenha volte no material da aula passada.

### Level 1: Set up

1. Crie as tabelas abaixo:

- Tabela "Clientes": ID_Cliente (chave primária), Nome, Email, Telefone;
- Tabela "Produtos": ID_Produto (chave primária), Nome, Preço, Categoria.
- Tabela "Pedidos": ID_Pedido (chave primária), ID_Cliente (chave estrangeira referenciando a tabela "Clientes"), Data_Pedido, Valor_Total;
- Tabela "DetalhesDoPedido": ID_Detalhe (chave primária), ID_Pedido (chave estrangeira referenciando a tabela "Pedidos"), ID_Produto (chave estrangeira referenciando a tabela "Produtos"),Quantidade;

### Level 2: Selects and selects...

1. Selecione todos os registros de uma tabela chamada "Clientes".
2. Selecione apenas os nomes dos clientes da tabela "Clientes".
3. Selecione todos os registros da tabela "Pedidos" onde o valor total seja superior a 100.
4. Selecione todos os produtos da tabela "Produtos" que tenham um preço menor que 50.
5. Atualize o nome de um cliente na tabela "Clientes" para um novo nome de sua escolha.
6.  Delete um registro da tabela "Produtos" com base em um critério específico, como o ID do produto.
7.  Selecione todos os pedidos da tabela "Pedidos" que foram feitos por um cliente específico.
8.  Calcule a média dos preços dos produtos na tabela "Produtos".
9.  Crie uma nova tabela chamada "Funcionários" com colunas para nome, cargo e data de contratação, e insira alguns registros nela.

### Level 3: Things got a little more complicated

1. Selecione todos os clientes que fizeram mais de 3 pedidos na tabela "Clientes" e "Pedidos".
2. Crie uma consulta que retorne o nome do cliente e o valor total de todos os pedidos feitos por ele.
3. Atualize os preços dos produtos na tabela "Produtos" com base em um aumento percentual específico.
4. Crie uma consulta que retorne a lista de produtos mais vendidos com base na contagem de pedidos na tabela "Produtos" e "DetalhesDoPedido".
5. Crie uma consulta que calcule a média, a mediana e o desvio padrão dos preços dos produtos na tabela "Produtos".
6. Selecione todos os pedidos feitos em um período de tempo específico, usando a tabela "Pedidos" e um intervalo de datas.
7. Crie uma consulta que identifique os clientes que não fizeram nenhum pedido nos últimos 6 meses na tabela "Clientes" e "Pedidos".
8. Crie uma consulta que classifique os produtos na tabela "Produtos" com base em seu preço, em ordem decrescente.
9. Crie uma consulta que retorne o total de vendas por categoria de produto na tabela "Produtos" e "DetalhesDoPedido".

### Level 4: It's CAGADA time

1. Tenha certeza que tem tudo salvo no seu github;
2. Tá salvo mesmo?
3. Beleza, então vai lá.
4. Faça um UPDATE sem a clausula WHERE numa tabela e vê o que acontece;
5. TENTE fazer um rollback;
6. Delete uma tabela e faça SELECT;
7. Agora vocês aprenderam o que não deve ser feito numa empresa real! Forte abraço e até a próxima aula.

### Level 5: Jogo Souls com boneco sem armadura, só no soco e preciso dizer isso para os meus colegas

1. Acesse esse link: https://www.hackerrank.com/domains/sql