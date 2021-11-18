# Project_Management_Tool
Projeto da Faculdade, trabalho A3.


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