
# API - Spring Boot + JPA + PostgreSQL

Esta é uma API simples construída com Spring Boot e JPA para gerenciar informações de pessoas, como nome e idade. A API utiliza um banco de dados PostgreSQL para armazenar os dados.


## Tecnologias
Tecnologias utilizadas
Spring Boot: Framework para construir aplicações Java de forma rápida e fácil.

Spring Data JPA: Para integração com o banco de dados utilizando JPA.

PostgreSQL: Banco de dados relacional utilizado para armazenar os dados da aplicação.

Maven: Gerenciador de dependências e construção do projeto.

Lombok: Biblioteca para simplificar o código Java, especialmente em relação a getters, setters e construtores.


## Rodar o projeto

Clone the project

```bash
   git clone https://github.com/JENER-MILHOMEM/api-Spring-Boot/
```

Go to the project directory

```bash
  cd api-Spring-Boot
```

Install dependencies

```bash
  mvn clean install
```

Start the server

```bash
  mvn spring-boot:run
```


## API Reference

#### Get all peoples

```http
  GET /people
```


#### Create people

```http
  POST /people
```

    
    {
      name: "example",
      age: example
    }

#### 
#### Update people

```http
  PUT /people/{id}
```

    
    {
      name: "example",
      age: example
    }

#### 
#### Delete people

```http
  GET /people/{id}
```

