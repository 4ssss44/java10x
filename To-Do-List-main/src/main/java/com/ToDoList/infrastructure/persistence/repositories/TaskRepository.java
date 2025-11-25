package com.ToDoList.infrastructure.persistence.repositories;

import com.ToDoList.infrastructure.persistence.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
