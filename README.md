<div align="center">
<img src="https://github.com/Daniela2319/API_ContadeBanco_Pessoa/assets/106537496/9e1d2296-5f89-45e2-9273-eb12ca6b0846" height="200" width="200"></div>
<h1 align="center"> DESENVOLVIMENTO JAVA COM IA - GFT </h1>

<p align="center"> <a href="https://web.dio.me/" target="_blank">DIO</a> </p>

<p align="center">
<a href="#sobre">Sobre</a>&nbsp;&nbsp;&nbsp|&nbsp;&nbsp;&nbsp;
<a href="#tecnologia">Tecnologia</a>&nbsp;&nbsp;&nbsp|&nbsp;&nbsp;&nbsp;
<a href="#autor">Autor</a>.</p>

# Sobre

<br>
<h1>API Projeto</h1>

Esta API foi desenvolvida com o objetivo de fornecer funcionalidades para gerenciamento de usuários, contas, recursos, cartões e notícias.
API reproduzida pela desafio de projetos da DIO é API REST na nuvem usando spring boot 3 e a nuvem Railway. 

# Diagrama de Classe 


```mermaid
classDiagram
    class User {
        + Long id
        + String name
        + Account account
        + Card card
        + List~Feature~ features
        + List~News~ news
    }
    
    class Account {
        + Long id
        + String number
        + String agency
        + Double balance
        + Double limit
    }
    
    class Card {
        + Long id
        + String number
        + Double limit
    }
    
    class Feature {
        + Long id
        + String icon
        + String description
    }
    
    class News {
        + Long id
        + String icon
        + String description
    }

    User "1"<-- "1" Account
    User "1"<-- "1"Card
    User "1"<-- "n"Feature
    User "1" <-- "n"News
```

# API Swagger e Railway
<br>

<br>
<p align="center">
<img src="https://github.com/Daniela2319/API_ContadeBanco_Pessoa/assets/106537496/5ad42109-4957-44e2-9508-eb3b3924f299" height="400" width="900">
  <br>
      
 </p>
 <p align="center">
    01 - Figura mostra no swagger sendo adicionado um usuário com deploy.
 </p>
<br>
 </p>
 <br>

 <br>
<p align="center">
<img src="https://github.com/Daniela2319/API_ContadeBanco_Pessoa/assets/106537496/1955301b-564c-448f-9f6d-c33f1c0c92e3" height="400" width="800">
  <br>
      
 </p>
 <p align="center">
    02 - Figura mostra interface do Railway mostrando tabela do usuario com banco de dados Postgrel.
 </p>
<br>
 </p>
 <br>


# Tecnologia

Esse projeto foi desenvolvindo com as seguintes tecnologias:

- **Java 17**: Linguagem de programação utilizada para desenvolver a API.
- **Spring Boot 3**: Framework que simplifica a criação de aplicações Java, permitindo configurar e iniciar a aplicação com o mínimo de esforço.
- **Spring Data JPA**: Abstração de persistência que facilita a implementação de repositórios baseados em JPA (Java Persistence API).
- **Swagger**: Ferramenta para documentação de APIs RESTful, permitindo testar as endpoints diretamente pela interface do Swagger UI.
- **Railway**: Plataforma de nuvem utilizada para deploy e hospedagem da aplicação.
  
<br>

  # Dificuldades API REST

  Encontrei dificuldades na aplicação em ambiente de produção. Após assistir ao vídeo do professor várias vezes, percebi que o problema
  estava relacionado à plataforma Railway. Ela não oferecia suporte para o Gradle 8.8, o que causava os erros na aplicação. 
  Resolvido problema API funcionou lindamente!

# Autor

_Daniela Velter_
<br>
<br>
[![Linkedin](https://img.shields.io/badge/DANIELA-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/daniela-velter-231485f/)


