package com.ToDoList.core.usecases;

import com.ToDoList.core.entities.Task;

public class CreateTaskImpl implements CreateTaskCase{
    @Override
    public Task execute(Task task) {
        return task;
    }
}
