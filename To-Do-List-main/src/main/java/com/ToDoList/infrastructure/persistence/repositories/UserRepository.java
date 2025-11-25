package com.ToDoList.infrastructure.persistence.repositories;

import com.ToDoList.infrastructure.persistence.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
