API - Spring Boot + JPA + PostgreSQL
Esta é uma API simples construída com Spring Boot e JPA para gerenciar informações de pessoas, como nome e idade. A API utiliza um banco de dados PostgreSQL para armazenar os dados.

Tecnologias utilizadas
Spring Boot: Framework para construir aplicações Java de forma rápida e fácil.

Spring Data JPA: Para integração com o banco de dados utilizando JPA.

PostgreSQL: Banco de dados relacional utilizado para armazenar os dados da aplicação.

Maven: Gerenciador de dependências e construção do projeto.

Lombok: Biblioteca para simplificar o código Java, especialmente em relação a getters, setters e construtores.

Endpoints
1. Criar uma nova pessoa
URL: /pessoas

Método: POST

Descrição: Cria uma nova pessoa com nome e idade.

Request Body:

json
Copiar
Editar
{
  "nome": "João",
  "idade": 30
}
Resposta:

Código 201 (Criado):

json
Copiar
Editar
{
  "id": 1,
  "nome": "João",
  "idade": 30
}
2. Buscar todas as pessoas
URL: /pessoas

Método: GET

Descrição: Retorna uma lista de todas as pessoas cadastradas.

Resposta:

Código 200 (OK):

json
Copiar
Editar
[
  {
    "id": 1,
    "nome": "João",
    "idade": 30
  },
  {
    "id": 2,
    "nome": "Maria",
    "idade": 25
  }
]
3. Buscar uma pessoa por ID
URL: /pessoas/{id}

Método: GET

Descrição: Retorna uma pessoa com base no seu ID.

Parâmetro de URL:

id: O ID da pessoa a ser buscada.

Resposta:

Código 200 (OK):

json
Copiar
Editar
{
  "id": 1,
  "nome": "João",
  "idade": 30
}
Código 404 (Não encontrado): Caso a pessoa com o ID fornecido não seja encontrada.

4. Atualizar uma pessoa
URL: /pessoas/{id}

Método: PUT

Descrição: Atualiza as informações de uma pessoa existente.

Parâmetro de URL:

id: O ID da pessoa a ser atualizada.

Request Body:

json
Copiar
Editar
{
  "nome": "João Silva",
  "idade": 31
}
Resposta:

Código 200 (OK):

json
Copiar
Editar
{
  "id": 1,
  "nome": "João Silva",
  "idade": 31
}
Código 404 (Não encontrado): Caso a pessoa com o ID fornecido não seja encontrada.

5. Excluir uma pessoa
URL: /pessoas/{id}

Método: DELETE

Descrição: Exclui uma pessoa com base no seu ID.

Parâmetro de URL:

id: O ID da pessoa a ser excluída.

Resposta:

Código 204 (Sem conteúdo): Caso a pessoa tenha sido excluída com sucesso.

Código 404 (Não encontrado): Caso a pessoa com o ID fornecido não seja encontrada.

Configuração do Banco de Dados
A API utiliza o PostgreSQL como banco de dados. Para configurar a conexão, você pode ajustar as configurações no arquivo application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_api
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.datasource.url: URL do banco de dados.

spring.datasource.username: Nome de usuário do banco de dados.

spring.datasource.password: Senha do banco de dados.

Como rodar o projeto
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/usuario/pessoa-api.git
cd pessoa-api
Configuração do banco de dados:

Certifique-se de que o PostgreSQL está instalado e em execução.

Crie um banco de dados chamado springboot_api (ou altere o nome no arquivo application.properties).

Instalar as dependências:

bash
Copiar
Editar
mvn clean install
Rodar a aplicação:

bash
Copiar
Editar
mvn spring-boot:run
A API estará disponível em http://localhost:8080.

Testando com o Postman
Você pode usar o Postman ou qualquer outra ferramenta de API para testar os endpoints da aplicação.

Estrutura do Projeto
src/main/java/com/exemplo/pessoa: Contém as classes do projeto.

Pessoa.java: Entidade JPA representando a pessoa.

PessoaController.java: Controlador com os endpoints da API.

PessoaRepository.java: Repositório JPA para interação com o banco de dados.

PessoaService.java: Lógica de negócio da aplicação.

src/main/resources/application.properties: Configurações da aplicação, como conexão com o banco de dados.
