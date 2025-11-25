-- V3__create_tb_task.sql

CREATE TABLE tb_task (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    created_date TIMESTAMP NOT NULL,
    deadline DATE,
    task_priority VARCHAR(20) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES tb_user(id)
);
