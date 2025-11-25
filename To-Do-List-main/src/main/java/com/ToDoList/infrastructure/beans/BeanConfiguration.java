package com.ToDoList.infrastructure.beans;

import com.ToDoList.core.gateway.UserGateway;
import com.ToDoList.core.usecases.CreateUserCase;
import com.ToDoList.core.usecases.CreateUserImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public CreateUserCase createUserCase(UserGateway userGateway){
        return new CreateUserImpl(userGateway);
    }
}
