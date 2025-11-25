package com.ToDoList.infrastructure.presentation;

import com.ToDoList.core.entities.User;
import com.ToDoList.core.usecases.CreateUserCase;
import com.ToDoList.core.usecases.CreateUserImpl;
import com.ToDoList.infrastructure.dto.UserDto;
import com.ToDoList.infrastructure.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/V1/user")
public class UserController {

    private final CreateUserCase createUser;

    public UserController(CreateUserCase createUser) {
        this.createUser = createUser;
    }


    @PostMapping(value = "/create")
    public ResponseEntity<UserDto> create(@RequestBody User user){

        User newUser = createUser.execute((user));

        return ResponseEntity.status(HttpStatus.CREATED).body(UserMapper.toDto(newUser));
    }

}