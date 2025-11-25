package com.ToDoList.infrastructure.gateway;

import com.ToDoList.core.entities.User;
import com.ToDoList.core.gateway.UserGateway;
import com.ToDoList.infrastructure.mapper.UserEntityMapper;
import com.ToDoList.infrastructure.persistence.UserEntity;
import com.ToDoList.infrastructure.persistence.repositories.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;

    public UserRepositoryGateway(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User execution(User user) {

        UserEntity newUser = userRepository.save(UserEntityMapper.toEntity(user));

        return UserEntityMapper.toDomain(newUser);
    }
}
