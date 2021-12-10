# Project_Management_Tool
Projeto da Faculdade, trabalho A3.

Link para biblioteca JDBC que deve ser informada como Lib do projeto:
https://dev.mysql.com/downloads/connector/j/?os=26

Link para Documentação:
https://docs.google.com/document/d/1TyMf71cnStuSivxaycKtHXL5P6F2tvDOcCI7gnLJ56E/edit?usp=sharing

Para criar os esquemas:
CREATE TABLE IF NOT EXISTS usuario ( 
    id BIGINT(10) AUTO_INCREMENT, 
    nome VARCHAR(255) DEFAULT '',
    cpf VARCHAR(255) DEFAULT '',
    email VARCHAR(255) DEFAULT '', 
    telefone VARCHAR(255) DEFAULT '',
    senha VARCHAR(255) DEFAULT '',
    login VARCHAR(255) DEFAULT '',
    nivel INT default 2,
    data_criacao datetime DEFAULT CURRENT_TIMESTAMP, # dizem q eh assim agora no mysql 8: https://stackoverflow.com/a/60247492
    data_modificacao datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);
###
CREATE TABLE IF NOT EXISTS projeto (
    id BIGINT(10) AUTO_INCREMENT,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    usuario_id BIGINT(10),
    data_criacao datetime DEFAULT CURRENT_TIMESTAMP, # dizem q eh assim agora no mysql 8: https://stackoverflow.com/a/60247492
    data_modificacao datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE
);
##### TABELA DE REQUISITOS ######
CREATE TABLE IF NOT EXISTS requisito (
    id BIGINT(10) AUTO_INCREMENT,
    descricao VARCHAR(255),
    modulo VARCHAR(255) DEFAULT '', 
    versao DOUBLE DEFAULT 0.0,
    estado VARCHAR(255) DEFAULT '',
    fase VARCHAR(255) DEFAULT '',
    funcionalidades VARCHAR(255) DEFAULT '',
    complexidade VARCHAR(255) DEFAULT '',
    ##autor_ultima_mod VARCHAR(255) DEFAULT '',
    esforco_horas DOUBLE DEFAULT 0.0,
    data_criacao datetime DEFAULT CURRENT_TIMESTAMP, # dizem q eh assim agora no mysql 8: https://stackoverflow.com/a/60247492
    data_modificacao datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    usuario_id BIGINT(10),
    projeto_id BIGINT(10),
    PRIMARY KEY (id), 
    FOREIGN KEY (projeto_id) REFERENCES projeto(id) ON DELETE CASCADE,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE
);
