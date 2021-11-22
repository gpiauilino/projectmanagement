# Project_Management_Tool
Projeto da Faculdade, trabalho A3.

Link para biblioteca JDBC que deve ser informada como Lib do projeto:
https://dev.mysql.com/downloads/connector/j/?os=26

Para criar os esquemas:

create schema if not exists db_projusu;
use db_projusu  ;

CREATE TABLE usuario (
 id BIGINT(10) AUTO_INCREMENT,
 nome VARCHAR(255),
 cpf VARCHAR(255),
 email VARCHAR(255),
 telefone VARCHAR(255),
 PRIMARY KEY (id)
);

CREATE TABLE projeto (
 id BIGINT(10) AUTO_INCREMENT,
 nome VARCHAR(255),
 descricao VARCHAR(255),
 email VARCHAR(255),
 telefone VARCHAR(255),
 PRIMARY KEY (id)
);
