# 🗃️ User Registration CLI

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=java"/>
  <img src="https://img.shields.io/badge/CLI-Application-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Made%20with-Love-ff69b4?style=for-the-badge"/>
</p>

<div align="center">
  <b>🇧🇷 Português | <a href="#english-version">🇺🇸 English below</a></b>
</div>

---

## 📑 Sumário | Table of Contents
- [Sobre o Projeto | About](#sobre-o-projeto--about)
- [Tecnologias | Technologies](#tecnologias--technologies)
- [Funcionalidades | Features](#funcionalidades--features)
- [Estrutura | Structure](#estrutura--structure)
- [Rotas/Menu | Menu Options](#rotasmenu--menu-options)
- [Configuração e Execução | Setup & Run](#configuração-e-execução--setup--run)
- [Autor | Author](#autor--author)

---

## Sobre o Projeto | About

**PT-BR:**
> Aplicação de linha de comando (CLI) para cadastro de usuários, permitindo criar, atualizar, excluir, buscar por ID e listar todos os usuários em memória. Inclui validação de dados e tratamento de exceções customizadas.

**EN:**
> Command-line (CLI) application for user registration, allowing you to create, update, delete, search by ID, and list all users in memory. Includes data validation and custom exception handling.

---

## 🚀 Tecnologias | Technologies

**PT-BR:**
- **Java 17+**: Linguagem principal do projeto.
- **CLI (Command Line Interface)**: Interação via terminal.

**EN:**
- **Java 17+**: Main project language.
- **CLI (Command Line Interface)**: Terminal interaction.

---

## ✨ Funcionalidades | Features

**PT-BR:**
- Cadastro de usuário com nome, email e data de nascimento.
- Atualização de dados do usuário.
- Exclusão de usuário por ID.
- Busca de usuário por ID.
- Listagem de todos os usuários cadastrados.
- Validação de dados (nome não vazio, email válido).
- Tratamento de exceções customizadas:
  - Usuário não encontrado
  - Armazenamento vazio
  - Dados inválidos

**EN:**
- Register user with name, email, and birth date.
- Update user data.
- Delete user by ID.
- Search user by ID.
- List all registered users.
- Data validation (non-empty name, valid email).
- Custom exception handling:
  - User not found
  - Empty storage
  - Invalid data

---

## 🗂️ Estrutura | Structure
```
dioDebugging/
├── src/
│   ├── App.java
│   └── br/
│       └── com/
│           └── dio/
│               ├── dao/
│               │   └── UserDAO.java
│               ├── exception/
│               │   ├── EmptyStorageException.java
│               │   ├── UserNotFoundException.java
│               │   └── ValidatorException.java
│               ├── model/
│               │   ├── MenuOption.java
│               │   └── UserModel.java
│               └── validator/
│                   └── UserValidator.java
├── bin/ (arquivos compilados)
└── README.md
```

---

## 🧭 Rotas/Menu | Menu Options

**PT-BR:**
- 1 Cadastrar (SAVE)
- 2 Atualizar (UPDATE)
- 3 Excluir (DELETE)
- 4 Buscar por ID (FIND_BY_ID)
- 5 Buscar todos (FIND_ALL)
- 6 Sair (EXIT)

**EN:**
- 1 Register (SAVE)
- 2 Update (UPDATE)
- 3 Delete (DELETE)
- 4 Search by ID (FIND_BY_ID)
- 5 List all (FIND_ALL)
- 6 Exit (EXIT)

---

## ⚙️ Configuração e Execução | Setup & Run

**PT-BR:**
1. **Pré-requisitos:** Java 17+ instalado
2. **Compile o projeto:**
   ```bash
   javac -d bin src/App.java
   ```
3. **Execute o projeto:**
   ```bash
   java -cp bin App
   ```

**EN:**
1. **Prerequisites:** Java 17+ installed
2. **Compile the project:**
   ```bash
   javac -d bin src/App.java
   ```
3. **Run the project:**
   ```bash
   java -cp bin App
   ```

---

## 👤 Autor | Author

**PT-BR:**

<div align="center">

**Rodolfo M. F. Abreu**  
Desenvolvedor de software apaixonado por tecnologia, aprendizado contínuo e boas práticas de programação. Sempre em busca de novos desafios e oportunidades para colaborar em projetos inovadores.

[![GitHub](https://img.shields.io/badge/GitHub-rodolfomfabreu-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

Sinta-se à vontade para entrar em contato para dúvidas, sugestões ou colaborações!

</div>

**EN:**

<div align="center">

**Rodolfo M. F. Abreu**  
Software developer passionate about technology, continuous learning, and best programming practices. Always looking for new challenges and opportunities to collaborate on innovative projects.

[![GitHub](https://img.shields.io/badge/GitHub-rodolfomfabreu-black?style=for-the-badge&logo=github)](https://github.com/salamandery)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Rodolfo%20Abreu-blue?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/rodolfo-marques-ferreira-de-abreu/)

Feel free to get in touch for questions, suggestions, or collaborations!

</div>

---

<div align="center">
  <b>Feito com 💙 para estudos de Java, CLI e boas práticas.<br/>
  Made with 💙 for Java, CLI, and best practices studies.</b>
</div>

---

<div align="center" id="english-version">
  <b>🇺🇸 English version above | <a href="#top">🇧🇷 Versão em português acima</a></b>
</div>