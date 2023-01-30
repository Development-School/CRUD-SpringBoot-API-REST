
# CRUD Completo SpringBoot API-REST

Sistema de cadastro como exemplo para salvar, atualizar, buscar e deletar registros em um banco de dados utilizando REST-APIS.

[IMAGEM]

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

Dependências (Spring Boot/Java):

- Spring Boot DevTools

- Rest Repositories Web

- Lombok

- Spring Data JPA

- Spring Web

- H2 DataBase

- Spring 

## Instruções para rodar o Projeto

- Baixe o projeto aqui do GitHub ou faça [clone](https://github.com/Development-School/CRUD-SpringBoot-API-REST) do projeto pelo seguinte comando pelo console ou CMD:

```bash
git clone https://github.com/Development-School/CRUD-SpringBoot-API-REST.git
```

- Abra o projeto em seu VS Code

[IMAGEM]

- Spring Boot server configuration

> As configurações do servidor já estão todas preenchidas, favor se atentar aos caminhos de contexto, como o do ["H2 Database"](https://www.h2database.com/html/main.html) e do "context-path"

```bash
#Habilitar contexto na URL:
server.servlet.context-path=/crud-spring-boot-rest-api

# -- H2 Database Configuration -- #
[...]
spring.h2.console.path=/h2

```

[IMAGEM]

- Para rodar o programa abra o arquivo "application.properties" em seu VS Code e rode o sistema conforme ilustrado abaixo

[IMAGEM]

> Iremos notar que no console já exibirá o Spring Boot sendo executado

- Em seu brownser abra o [link](http://localhost:8000/crud-spring-boot-rest-api/h2) abaixo para verificar as configurações do banco de dados H2

[http://localhost:8000/crud-spring-boot-rest-api/h2](http://localhost:8000/crud-spring-boot-rest-api/h2)

[IMAGEM]

1. Note que a porta utilizada nós definimos lá no arquivo "application.properties":

```bash
server.port=8000
```

2. Note também que ao iniciar o programa as tabelas já foram criadas no banco H2:

[IMAGEM]

> A criação das mesmas são realizadas através das seguintes anotações:

[@Entity](https://www.devmedia.com.br/jpa-como-usar-a-anotacao-entity/38410)<BR>
[@Id](https://www.devmedia.com.br/jpa-como-usar-a-anotacao-id/38508#:~:text=A%20anota%C3%A7%C3%A3o%20I%40Id%20%C3%A9,caso%20ela%20n%C3%A3o%20esteja%20presente.)

Leia mais sobre as anotações [aqui](https://strn.com.br/artigos/2018/12/11/todas-as-anota%C3%A7%C3%B5es-do-jpa-anota%C3%A7%C3%B5es-de-mapeamento/).


[IMAGEM]

- 

```bash


```

```bash


```

## Getting help

Any usage issues can ask for help via

* [Gitter](https://gitter.im/orgs/linuxdeepin/rooms)
* [IRC channel](https://webchat.freenode.net/?channels=deepin)
* [Forum](https://bbs.deepin.org)
* [WiKi](https://wiki.deepin.org/)

## Getting involved

We encourage you to report issues and contribute changes

* [Contribution guide for users.](http://wiki.deepin.org/index.php?title=Contribution_Guidelines_for_Users)
* [Contribution guide for developers.](http://wiki.deepin.org/index.php?title=Contribution_Guidelines_for_Developers).

## License

Deepin Boot Maker is licensed under [GPLv3](LICENSE).

## Credits and references

1. [UNetbootin](https://github.com/unetbootin/unetbootin): this projects is derived form unetbootin, but now there are big differences between them.
