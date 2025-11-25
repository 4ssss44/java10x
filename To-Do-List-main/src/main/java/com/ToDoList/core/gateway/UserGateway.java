package com.ToDoList.core.gateway;

import com.ToDoList.core.entities.User;

public interface UserGateway {
    User execution(User user);
}
