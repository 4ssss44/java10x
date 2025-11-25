package com.ToDoList.infrastructure.mapper;

import com.ToDoList.core.entities.Task;
import com.ToDoList.infrastructure.dto.TaskDto;
import com.ToDoList.infrastructure.persistence.TaskEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TaskMapper {

    public TaskDto toDto(Task task){
        return TaskDto
                .builder()
                .id(task.id())
                .user(task.user())
                .title(task.title())
                .description(task.description())
                .taskPriority(task.taskPriority())
                .deadline(task.deadline())
                .createdDate(task.createdDate())
                .build();
    }

    public Task toDomain(TaskDto dto){
        return new Task(
                dto.id(),
                dto.user(),
                dto.title(),
                dto.description(),
                dto.createdDate(),
                dto.deadline(),
                dto.taskPriority()
        );
    }
}
