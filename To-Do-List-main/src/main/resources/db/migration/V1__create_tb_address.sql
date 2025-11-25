-- V1__create_tb_user.sql

CREATE TABLE tb_address (
    id BIGSERIAL PRIMARY KEY,
    street VARCHAR(100) NOT NULL,
    number VARCHAR(10),
    complement VARCHAR(50),
    neighborhood VARCHAR(50),
    city VARCHAR(50),
    state VARCHAR(20),
    postal_code VARCHAR(10) NOT NULL,
    country VARCHAR(50)
);