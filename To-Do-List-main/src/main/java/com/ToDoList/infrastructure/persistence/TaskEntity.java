package com.ToDoList.infrastructure.persistence;

import com.ToDoList.core.entities.enums.TaskPriority;
import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Builder
@Entity
@Table(name = "tb_task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    private String title;

    private String description;

    private LocalDateTime createdDate;

    private LocalDate deadline;

    @Enumerated(EnumType.STRING)
    private TaskPriority taskPriority;

    public TaskEntity() {
    }

    public TaskEntity(Long id, UserEntity user, String title, String description, LocalDateTime createdDate, LocalDate deadline, TaskPriority taskPriority) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.description = description;
        this.createdDate = createdDate;
        this.deadline = deadline;
        this.taskPriority = taskPriority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }
}
