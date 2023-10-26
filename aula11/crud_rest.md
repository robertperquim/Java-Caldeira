# 🎮 **Missão de Java: Modo CRUD REST** 🎮
## 📋 **Desafio Épico: Lista de de games para zerar** 📋
### 🚀 Configuração Inicial
- Configure um projeto Spring Boot no spring-initializr usando uma ferramenta de construção como o Maven ou o Gradle. 
- O nome do projeto deve ser: to-do-service.
- Adicione a dependência Spring Web.

### ✅ Crie a Tarefa
- Defina uma classe Task ou Tarefa que representará uma tarefa a ser realizada. Esse modelo deve incluir campos como id, descrição, data de vencimento, estado (concluída ou não).

###🎮 Implemente o controlador
- Crie um controlador (por exemplo, TaskController) que possui somente 1 atributo, a lista de Tarefas. A partir disso, crie os endpoints conforme apresentamos anteriormente:
  - /tasks -> Para listar todas as tasks
  - /tasks/add -> Para adicionar nova tarefa
  - /tasks/edit/{taskId} -> Para editar uma tarefa
  - /tasks/delete/{taskId} -> Para remover uma tarefa.
- Atenção! Faça um endpoint por vez e teste, não saia codando tudo de uma vez!!!

### 📦 Divisão de responsabilidades
- Por enquanto estamos com um projeto que só tem 2 classes, está na hora de organizarmos o nosso projetinho:
  - Crie os pacotes: controller, model e service.
  - Refatore o projeto, crie uma nova classe TaskService ou TarefaService para que ela guarde a Lista de modelos.
  - Transfira a lógica que tem no controlador para o serviço.
  - Faça um por vez, teste, valide e vá para o próximo.

### 🔀 Endpoints bem feitos
- Refatore as URIs da sua API para que fiquem no padrão correto.
- Como fazer isso? Ora, ora, temos isso no nosso material, se não quiser olhar por lá pesquise por: "best practices api endpoints".
- Faça um por vez, teste, valide e vá para o próximo.

### 🔒 Valide sua entrada
- Um modelo pode ser fornecido de maneira errada, por exemplo: a Tarefa pode vir incompleta ou capenga. Como vimos antes, a gente precisa lidar com isso para que a aplicação não quebre.
- Se você pensou em tratamento de exceções para esse item, é quase isso, tem um jeito mais fácil:
- Uma documentação para você se aventurar: [Tutorial: Spring Boot Bean Validation](https://www.baeldung.com/spring-boot-bean-validation)

### 🚧 Minha API é REST mas cadê o tratamento do http status?
- Meus nobres! Chegou a hora de uma nova refatoração, tá na hora de aprender a usar o ResponseEntity. E o que diabos é isso?
- Spoiler warning:
  - Malandro! Toma mais tutorial e uma documentação:
    - [Tutorial: Spring ResponseEntity](https://www.baeldung.com/spring-response-entity)
    - [Documentação: ResponseEntity](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html)

### 🧪 Testes unitários
- Achou que fosse escapar não é mesmo? Crie os testes unitários para a classe SERVICE somente.

### 🚨 Muito importante, um tópico muito temido no Java mas que vocês já derrotaram: Exceções
- Adicione um tratamento de erro para seu código, por exemplo, lance uma exceção quando não encontrar a tarefa.
- Mas com o Spring, o jogo muda, precisamos adicionar esse tratamento no lugar certo, mas não tema! Pois nós temos uma... uma... uminha.....
- Spoiler warning:
  - TUTORIAL e DOCUMENTAÇÃO:
    - [Tutorial: Exception Handling for REST with Spring](https://www.baeldung.com/exception-handling-for-rest-with-spring)
    - [Documentação: Exception Handlers](https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-servlet/exceptionhandlers.html)


### 🔍 Respostas:

<details>
 <summary>Spoiler warning</summary>

![image](quindin_panqueca.jpeg)

O Quindin e o Panqueca estão aguardando a lista de games para zerar, enquanto isso eles tiram uma soneca 😴

</details>
