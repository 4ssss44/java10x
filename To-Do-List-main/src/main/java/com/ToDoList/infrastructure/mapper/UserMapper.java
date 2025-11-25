package com.ToDoList.infrastructure.mapper;

import com.ToDoList.core.entities.User;
import com.ToDoList.infrastructure.dto.UserDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

    public UserDto toDto(User user){
        return UserDto
                .builder()
                .id(user.getId())
                .name(user.getName())
                .address(user.getAddress())
                .accountType(user.getAccountType())
                .tasks(user.getTask())
                .createdDate(user.getCreationDate())
                .build();
    }

    public User toDomain(UserDto dto){
        return new User(
                dto.id(),
                dto.name(),
                dto.accountType(),
                dto.address(),
                dto.tasks(),
                dto.createdDate()
        );
    }
}
