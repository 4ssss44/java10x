package com.ToDoList.core.usecases;

import com.ToDoList.core.entities.Task;

public interface CreateTaskCase {
    public Task execute(Task task);
}
