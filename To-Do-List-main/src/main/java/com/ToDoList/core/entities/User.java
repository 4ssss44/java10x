package com.ToDoList.core.entities;

import com.ToDoList.core.entities.enums.AccountType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    Long id;
    String name;
    LocalDate birthDate;
    Address address;
    String email;
    String password;
    AccountType accountType;
    List<Task> task = new ArrayList<>();
    LocalDate creationDate;

    public User() {
    }

    public User(Long id, String name, LocalDate birthDate, Address address, String email, String password, AccountType accountType, List<Task> task, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.password = password;
        this.accountType = accountType;
        this.task = task;
        this.creationDate = creationDate;
    }

    public User(Long id, String name, AccountType accountType, Address address, List<Task> tasks, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.accountType = accountType;
        this.address = address;
        this.task = tasks;
        this.creationDate = localDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}

