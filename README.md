
# 🔐 Forum Hub — API REST com Spring Security

O **Forum Hub** é um projeto de API REST desenvolvido com **Java e Spring Boot**, voltado ao gerenciamento de tópicos de um fórum fictício.

O projeto foi utilizado durante meus estudos de segurança em aplicações Backend, acompanhando dois cursos da **Alura**, com foco na implementação de mecanismos de segurança, como autenticação e autorização.

## 🚀 Tecnologias e conceitos utilizados

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- JWT (JSON Web Token)
- OAuth 2.0 e OpenID Connect (OIDC)
- RestClient
- Autenticação de dois fatores (2FA / TOTP)
- Maven

## 🔑 Funcionalidades abordadas no projeto

### Autenticação e autorização de usuários

- Cadastro e gerenciamento de usuários.
- Criptografia de senhas.
- Autenticação com tokens JWT.
- Access Token e Refresh Token.
- Configuração de autenticação Stateless.
- Filtros de autenticação e validação de tokens.
- Controle de acesso baseado em perfis, permissões e hierarquias.

### Integrações e segurança

- Fluxos de login externo com GitHub e Google utilizando OAuth 2.0.
- Utilização de OpenID Connect (OIDC).
- Comunicação com APIs externas utilizando RestClient.
- Verificação de e-mail de usuários.
- Autenticação de dois fatores com TOTP.
- Geração de QR Code e validação de códigos temporários.

> **Observação:** algumas integrações externas dependem de configurações adicionais e credenciais próprias. Os fluxos ainda não foram integralmente testados em ambiente de execução.


### 🔒 Fluxo de autenticação e autorização do usuário

O projeto aborda diferentes mecanismos para controlar o acesso dos usuários à API Forum Hub:

- **Autenticação:** identificação do usuário por meio de suas credenciais, email e senha.
- **JWT:** geração de tokens de acesso após a autenticação.
- **Filtros de segurança:** validação dos tokens recebidos nas requisições dos usuaários.
- **Refresh Token:** mecanismo para renovação do acesso sem exigir um novo login completo.
- **Autorização:** controle das funcionalidades disponíveis de acordo com os perfis e permissões associados ao usuário.

Com o **Spring Security**, esses mecanismos permitem separar a identificação do usuário das regras que determinam quais recursos ele pode acessar, garantindo segurança e acesso corretos.


## ⚙️ Configurações e variáveis de ambiente

O projeto utiliza **MySQL** para persistência de dados, **SMTP** para envio de e-mails e configurações de **OAuth 2.0** para autenticação com GitHub e Google.

Para utilizar as funcionalidades que dependem desses serviços, é necessário configurar as credenciais correspondentes.

### 1. Variáveis de ambiente

| Variável | Descrição                                                         |
|---|-------------------------------------------------------------------|
| `EMAIL_USERNAME` | E-mail utilizado pélo usuário para autenticação no servidor SMTP. |
| `EMAIL_PASSWORD` | Senha ou credencial do usuário de aplicativo do serviço SMTP.     |
| `GITHUB_CLIENT_ID` | Identificador do usua´rio OAuth do GitHub.                        |
| `GITHUB_CLIENT_SECRET` | Segredo do usuário OAuth do GitHub.                               |
| `GOOGLE_CLIENT_ID` | Identificador do usuário OAuth do Google.                         |
| `GOOGLE_CLIENT_SECRET` | Segredo do usuário OAuth do Google.                               |

### 2. Configurando as variáveis no Windows

Para cadastrar as variáveis de ambiente:

1. Abra o menu Iniciar e pesquise por **Editar as variáveis de ambiente para sua conta**.
2. Na seção **Variáveis de usuário**, clique em **Novo**.
3. Informe o nome da variável, como `EMAIL_USERNAME`.
4. No campo de valor, informe a credencial correspondente.
5. Repita o procedimento para as demais variáveis necessárias.
6. Reinicie o IntelliJ IDEA para que as alterações sejam reconhecidas.

### 3. Configuração do application.properties

O Spring Boot utiliza a sintaxe `${NOME_DA_VARIAVEL}` para acessar variáveis de ambiente.

Configuração recomendada para que o usuário consiga rodar o projeto:

```properties
spring.datasource.url=jdbc:mysql://localhost/forum_hub?createDatabaseIfNotExist=true
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=${EMAIL_USERNAME}
spring.mail.password=${EMAIL_PASSWORD}
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

github.oauth.client.id=${GITHUB_CLIENT_ID}
github.oauth.client.secret=${GITHUB_CLIENT_SECRET}

google.oauth.client.id=${GOOGLE_CLIENT_ID}
google.oauth.client.secret=${GOOGLE_CLIENT_SECRET}
```

**Observação:** o exemplo acima também utiliza as variáveis `DB_USERNAME` e `DB_PASSWORD` para as credenciais do MySQL.

Essa é uma configuração recomendada. Para utilizá-la, o arquivo `application.properties` do projeto também deverá ser ajustado.

### 4. Cuidados com as credenciais

- Não publique senhas, tokens ou Client Secrets no GitHub.
- Utilize variáveis de ambiente para armazenar informações sensíveis.
- Configure as credenciais de acordo com os serviços utilizados.
- As integrações externas exigem configurações adicionais nos respectivos provedores.

## 📚 Cursos estudados durante o projeto

Projeto desenvolvido durante os estudos dos cursos da **Alura**:

- **Java e Spring Security: Proteja suas APIs REST.**
- **Java e Spring Security: Login com GitHub, Google e autenticação de 2 fatores.**

## 📌 Status do projeto

🚧 **Em desenvolvimento e documentação.**

Este repositório acompanha minha evolução nos estudos de Java Backend e segurança de aplicações.

A documentação será ampliada com detalhes da arquitetura, exemplos de endpoints, imagens e demonstrações do projeto.
