# Primeiro Projeto Com Spring Boot
### API REST com banco de dados usando Java e Spring Boot

Aula do Nelio Alves 

Link da Aula: https://www.youtube.com/watch?v=D4frmIHAxEY

### Visão geral do sistema
Construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

#### - Buscar todos usuários
#### - Buscar um usuário pelo seu id
#### - Inserir um novo usuário

![Visão Geral do Sistema](https://github.com/luanalimadeveloper/Primeiro_Projeto_Com_Spring_Boot/blob/master/img/dominio.png)

### Desenvolvimento moderno: relacional -> objeto -> json

![Sistema](https://github.com/luanalimadeveloper/Primeiro_Projeto_Com_Spring_Boot/blob/master/img/objetos.png)

### Script SQL

INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');








