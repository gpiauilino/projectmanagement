USE db_projusu;
DROP TABLE IF EXISTS requisito;
DROP TABLE IF EXISTS projeto;
DROP TABLE IF EXISTS usuario;

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
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
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
    FOREIGN KEY (projeto_id) REFERENCES projeto(id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

### sobre str to date no mysql
### https://dev.mysql.com/doc/refman/5.7/en/date-and-time-functions.html#function_str-to-date
### STR_TO_DATE("03-11-2021","%d-%m-%Y"),

#### inserir um usuario
INSERT INTO usuario( nome, cpf, email, telefone, senha, login, nivel)
		VALUES("Seilah", "cp", "em", "te", "senha", "username", 1);
#### outro usuario
INSERT INTO usuario(nome, nivel)VALUES("Fulano", 1);

#### altera o nome com base no id
UPDATE usuario SET nome = "CMS" WHERE id = 1;
####
####- insere um projeto informado o id 1 de usuario
INSERT INTO projeto (nome, descricao, usuario_id)
VALUES("ProjetodeVida2", "Nada_muito a fazer", 1 );

#### insere um segundo projeto, informando nome do projeto, descricao do projeto e o usuario de id=2
INSERT INTO projeto (nome, descricao, usuario_id)
VALUES("ProjetoMalcomecou", "muito a fazer", 2);
####

###
## SELECIONAR
#### exibe todos os usuarios
SELECT * from usuario;
SELECT * from projeto;
select * from requisito;
#- seleciona cruzando as tabelas
SELECT p.descricao as proj_descricao, u.nome as usuario_nome
FROM projeto p, usuario u;

#---- seleciona relacionano projeto ao usuario usando JOIN
select p.descricao as proj_descricao, u.nome as usuario_nome 
FROM usuario u
JOIN projeto p ON u.id = p.id;
#-------------

##E Select com JOIN retornando o nome do usuario e a DESCRICAO do projeto 
# informando o NOME do projeto 
SELECT u.nome as user_nome, p.descricao as descricao_do_projeto
FROM usuario u
JOIN projeto p ON u.id = p.id
WHERE p.nome = "ProjetodeVida2"; 

###
##### TABELA DE REQUISITOS ######
####---
INSERT INTO requisito ( 
    descricao, modulo, versao, 
    estado,    fase,   funcionalidades, 
    complexidade, esforco_horas,  usuario_id,  projeto_id)
VALUES ("Descricao do reqisito", "QUEISSODE MODULO", 2.03, 
		"INICIAL", "PARADO", "TODAS", 
        "ALTAMENTE COMPLEXO", 12.2, 1,1);

INSERT INTO requisito ( 
    descricao, modulo, versao, 
    estado,    fase,   funcionalidades, 
    complexidade, esforco_horas,  usuario_id,  projeto_id)
VALUES ("Outro reqisito", "QEISSODE MODULO", 3.03, 
		"INICIAL", "PARADO", "TODAS", 
        "ALTAMENTE COMPLEXO", 12.2, 2,1);


select * from requisito;

##### TESTES RELACIONAMENTOS das tres
###  SELECIONAR DE requisto os campos DESCRICAO, do projeto o NOME
## pelo nome do usuario
SELECT r.descricao as requisitoDetails, 
p.nome as nomeProjeto, 
r.id as requisito_id,
u.id as usuario_id,
p.id as projeto_id, 
u.nome as autor
FROM requisito r
JOIN projeto p ON r.id = p.id
JOIN usuario u ON r.id = u.id
WHERE u.nome = "Fulano";

SELECT r.descricao as requisitoDetails, 
p.nome as nomeProjeto, 
r.id as requisito_id,
u.id as usuario_id,
p.id as projeto_id, 
u.nome as autor
FROM requisito r
JOIN projeto p ON r.id = p.id
JOIN usuario u ON r.id = u.id
WHERE r.projeto_id = ?;
