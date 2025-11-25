package com.ToDoList.core.entities;

import com.ToDoList.core.entities.enums.TaskPriority;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Task(Long id,
                   User user,
                   String title,
                   String description,
                   LocalDateTime createdDate,
                   LocalDate deadline,
                   TaskPriority taskPriority) {
}
