package com.ToDoList.infrastructure.mapper;

import com.ToDoList.core.entities.Task;
import com.ToDoList.infrastructure.persistence.TaskEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TaskEntityMapper {
    public TaskEntity toEntity(Task task) {
        return new TaskEntity(
                task.id(),
                UserEntityMapper.toEntity(task.user()),
                task.title(),
                task.description(),
                task.createdDate(),
                task.deadline(),
                task.taskPriority()
        );
    }

    public Task toDomain(TaskEntity taskEntity) {
        return new Task(
                taskEntity.getId(),
                UserEntityMapper.toDomain(taskEntity.getUser()),
                taskEntity.getTitle(),
                taskEntity.getDescription(),
                taskEntity.getCreatedDate(),
                taskEntity.getDeadline(),
                taskEntity.getTaskPriority()
        );
    }
}
