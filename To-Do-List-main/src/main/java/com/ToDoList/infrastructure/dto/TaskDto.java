package com.ToDoList.infrastructure.dto;

import com.ToDoList.core.entities.User;
import com.ToDoList.core.entities.enums.TaskPriority;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public record TaskDto(
        Long id,
        User user,
        String title,
        String description,
        LocalDateTime createdDate,
        LocalDate deadline,
        TaskPriority taskPriority){

}
