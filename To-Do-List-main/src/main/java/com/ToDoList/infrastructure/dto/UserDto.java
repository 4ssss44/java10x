package com.ToDoList.infrastructure.dto;

import com.ToDoList.core.entities.Address;
import com.ToDoList.core.entities.Task;
import com.ToDoList.core.entities.enums.AccountType;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record UserDto(Long id,
                      String name,
                      Address address,
                      AccountType accountType,
                      List<Task> tasks,
                      LocalDate createdDate) {
}
