
# CRUD Completo SpringBoot API-REST
<br>
Sistema de cadastro para salvar, atualizar, buscar e deletar registros em um banco de dados utilizando REST-APIS.
<br><br><br>

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/0.%20Sistema%20de%20Gest%C3%A3o%20de%20Pessoas.png)

## Dependëncias

Este sistema CRUD é projetado para suportar Windows/Linux/Mac platforms. Os seguintes pacotes serão necessários para uso:

Versão do Java utilizado:
```bash
#java --version
java 16.0.1 2021-04-20
Java(TM) SE Runtime Environment (build 16.0.1+9-24)
Java HotSpot(TM) 64-Bit Server VM (build 16.0.1+9-24, mixed mode, sharing)
```

Pré-requisitos (Sistema):

- Visual Studio Code

- Java JDK

- Apache Maven

- Apache Tomcat

- Navegador (Utilizamos o [Google Chrome](https://www.google.com/intl/pt-BR/chrome/))
<br>
Dependências (Spring Boot/Java):

- Spring Boot DevTools

- Rest Repositories Web

- Lombok

- Spring Data JPA

- Spring Web

- H2 DataBase

## Instruções para rodar o Projeto

- Baixe o projeto aqui do GitHub ou faça [clone](https://github.com/Development-School/CRUD-SpringBoot-API-REST) do projeto pelo seguinte comando em seu console ou CMD:

```bash
git clone https://github.com/Development-School/CRUD-SpringBoot-API-REST.git
```

- Abra o projeto em seu VS Code

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/1.%20Projeto.png)

- Configurações do Servidor do Spring Boot

> As configurações do servidor já estão todas preenchidas, favor se atentar aos caminhos de contexto, como o do ["H2 Database"](https://www.h2database.com/html/main.html) e do "context-path"

```bash
#Habilitar contexto na URL:
server.servlet.context-path=/crud-spring-boot-rest-api

# -- H2 Database Configuration -- #
[...]
spring.h2.console.path=/h2

```

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/2.%20Configura%C3%A7%C3%B5es%20do%20Servidor.png)

- Para rodar o programa abra o arquivo "Application.java" em seu VS Code e rode o sistema conforme ilustrado abaixo

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/3.%20Iniciando%20projeto.png)

> Iremos notar que no console já exibirá o Spring Boot sendo executado

- Em seu brownser abra o [link](http://localhost:8000/crud-spring-boot-rest-api/h2) abaixo para verificar as configurações do banco de dados H2

[http://localhost:8000/crud-spring-boot-rest-api/h2](http://localhost:8000/crud-spring-boot-rest-api/h2)

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/4.%20Brownser%20-%20H2.png)

1. Note que a porta utilizada nós definimos lá no arquivo "application.properties":

```bash
# Configuração de porta
server.port=8000
```

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/5.%20Porta%20Servidor.png)

2. Note também que ao iniciar o programa as tabelas já foram criadas no banco H2:

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/6.%20Tabelas%20Criadas.png)

> A criação das mesmas são realizadas através das seguintes anotações:

[@Entity](https://www.devmedia.com.br/jpa-como-usar-a-anotacao-entity/38410)<BR>
[@Id](https://www.devmedia.com.br/jpa-como-usar-a-anotacao-id/38508#:~:text=A%20anota%C3%A7%C3%A3o%20I%40Id%20%C3%A9,caso%20ela%20n%C3%A3o%20esteja%20presente.)

Leia mais sobre anotações [aqui](https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/).

- Para visualizar a aplicação e testar o CRUD entre em um dos seguintes links e pronto:

[http://localhost:8000/crud-spring-boot-rest-api/](http://localhost:8000/crud-spring-boot-rest-api/)
ou
[http://localhost:8000/crud-spring-boot-rest-api/index.html](http://localhost:8000/crud-spring-boot-rest-api/index.html)

![screenshot](https://github.com/Development-School/CRUD-SpringBoot-API-REST/blob/main/Imagens/7.%20Aplica%C3%A7%C3%A3o.png)

## Conseguindo ajuda

Quaisquer problemas de uso podem tirar suas duvidas via

* [Instagram](https://www.instagram.com/lucascaminhaslz/)
* [Telegram](https://t.me/lcaminha)
* [Linkedin](https://www.linkedin.com/in/lcaminha/)
* [Facebook](https://www.facebook.com/lcaminha)
* [Twiter](https://twitter.com/lucascaminhaslz)
* [StackOverFlow](https://stackoverflow.com/users/4784304/lucas-caminha)


## Créditos e Referências

1. [CRUD Completo com Spring Boot REST API](https://projetojavaweb.com/certificado-aluno/plataforma-curso/aulagratuita?codigoCurso=10&token=8e551ac1-b128-4bc3-bdf5-91ab81ab5c9f): CRUD Completo de Spring Boot da JDev Treinamento.
2. [REST APIs Básico - Introdução](https://www.youtube.com/watch?v=P1Mm-gTi5i8&list=PL3B-OV5dZTqbaLi1f2UmXEWbcx9WyYaTX): Esta série de vídeos ensina REST APIs em um nível básico.
3. [CRUD em API Rest com Spring Boot, H2, Maven e JPA+ Hibernate](https://mmarcosab.medium.com/crud-em-api-rest-com-spring-boot-h2-maven-e-jpa-hibernate-e-documenta%C3%A7%C3%A3o-com-swagger-parte-1-1040e2aae0ed): Este tutorial te ensina a criar o projeto de uma api rest Java usando o framework Spring Boot, H2 e JPA + Hibernate, além de documentar com Swagger.
4. [Criando uma API REST com o Spring Boot](https://www.treinaweb.com.br/blog/criando-uma-api-rest-com-o-spring-boot): Todos os passos da criação de uma API REST com o framework Spring Boot do Java, no Visual Studio Code.
5. [Como Fazer Uma API](https://www.youtube.com/watch?v=f7JWDLFhR_c): Aprender a programar uma API Rest (REST API) utilizando Variáveis de Ambiente (Environment Variables).
6. [Aprenda a criar um projeto Spring Boot pelo VS Code](https://www.youtube.com/watch?v=D_K3po7er70): Aprenda como criar um projeto Spring Boot através do VS Code
7. [Spring Boot JPA + H2 example: Build a CRUD Rest APIs](https://www.bezkoder.com/spring-boot-jpa-h2-example/): Neste tutorial, vamos construir um exemplo de API da Spring Boot Rest Crud com o Maven que usa o Spring Data JPA para interagir com o banco de dados H2.
8. [Java no Visual Studio Code: Projetos com Spring Boot](https://www.youtube.com/watch?v=dkmlOi_MNb4): Vídeo tutorial como criar e executar projetos Java com Spring Boot no Visual Studio Code.
9. [REST API com Java/Spring (6 horas)](https://www.youtube.com/playlist?list=PLg5-aZqPjMmAjcS-7lDTdWry9_KvappUF): Playlist do Hélio Kamakawa com 8 vídeos sobre REST API.
10. [API Spring Boot, JPA e H2 do jeito certo PASSO A PASSO](https://www.youtube.com/watch?v=HHXn-nT3g10): Criação de projeto Spring Boot do Zero.
11. [JPA: Como usar a anotação @Entity](https://www.devmedia.com.br/jpa-como-usar-a-anotacao-entity/38410): Nesta documentação você aprenderá a utilizar a anotação @Entity para informar que uma classe representa uma entidade e que seus objetos devem ser persistidos no banco de dados.
12. [JPA: Como usar a anotação @Id](https://www.devmedia.com.br/jpa-como-usar-a-anotacao-id/38508#:~:text=A%20anota%C3%A7%C3%A3o%20I%40Id%20%C3%A9,caso%20ela%20n%C3%A3o%20esteja%20presente.): Já nesta documentação você aprenderá a utilizar a anotação @Entity.
13. [Todas as anotações do JPA: Anotações de Mapeamento](https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/): Este arquivo fornece as anotações de mapeamento do JPA para referência rápida e/ou resumo. Vamos começar!
