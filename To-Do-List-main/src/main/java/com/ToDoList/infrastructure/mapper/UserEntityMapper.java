package com.ToDoList.infrastructure.mapper;

import com.ToDoList.core.entities.User;
import com.ToDoList.infrastructure.persistence.UserEntity;
import lombok.experimental.UtilityClass;

import java.util.stream.Collectors;

@UtilityClass
public class UserEntityMapper {

    public UserEntity toEntity(User user){
        return UserEntity
                .builder()
                .id(user.getId())
                .name(user.getName())
                .birthDate(user.getBirthDate())
                .address(AddressEntityMapper.toEntity(user.getAddress()))
                .email(user.getEmail())
                .password(user.getPassword())
                .tasks(user.getTask()
                        .stream()
                        .map(TaskEntityMapper::toEntity)
                        .collect(Collectors.toList()))
                .accountType(user.getAccountType())
                .creationDate(user.getCreationDate())
                .build();
    }

    public User toDomain(UserEntity user){
        return new User(
                user.getId(),
                user.getName(),
                user.getBirthDate(),
                AddressEntityMapper.toDomain(user.getAddress()),
                user.getEmail(),
                user.getPassword(),
                user.getAccountType(),
                user.getTasks()
                        .stream()
                        .map(TaskEntityMapper::toDomain)
                        .collect(Collectors.toList()),
                user.getCreationDate()
        );
    }
}
