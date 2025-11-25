package com.ToDoList.core.usecases;

import com.ToDoList.core.entities.User;
import com.ToDoList.core.gateway.UserGateway;

public class CreateUserImpl implements CreateUserCase {

    private final UserGateway userGateway;

    public CreateUserImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }


    @Override
    public User execute(User user) {
        return user;
    }
}
