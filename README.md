
# 🔐 Forum Hub — API REST com Spring Security

O **Forum Hub** é um projeto de API REST desenvolvido com **Java e Spring Boot**, voltado ao gerenciamento de tópicos de um fórum.

O projeto foi utilizado durante meus estudos de segurança em aplicações Backend, acompanhando dois cursos da **Alura**, com foco na implementação de mecanismos de autenticação, autorização e controle de acesso.

## 🚀 Tecnologias e conceitos

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

### Autenticação e autorização

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

## ⚙️ Configurações

O projeto utiliza MySQL para persistência de dados e possui configurações para envio de e-mails via SMTP e integração OAuth com GitHub e Google.

As integrações externas dependem de credenciais e configurações específicas, que devem ser fornecidas em um ambiente apropriado.

## 📚 Cursos utilizados

Projeto desenvolvido durante os estudos dos cursos da **Alura**:

- Java e Spring Security: Proteja suas APIs REST.
- Java e Spring Security: Login com GitHub, Google e autenticação de 2 fatores.

## 📌 Status

🚧 **Em desenvolvimento e documentação.**

Este repositório acompanha minha evolução nos estudos de Java Backend e segurança de aplicações. A documentação será ampliada com detalhes da arquitetura, exemplos de endpoints e demonstrações do projeto.
