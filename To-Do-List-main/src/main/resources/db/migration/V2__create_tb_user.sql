-- V2__create_tb_user.sql

CREATE TABLE tb_user (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    birthDate DATE NOT NULL,
    address_id BIGINT UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    account_type VARCHAR(50) NOT NULL,
    creationDate DATE,
    FOREIGN KEY (address_id) REFERENCES tb_address(id)
);

