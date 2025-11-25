package com.ToDoList.core.entities;

public record Address(
        Long id,
        User user,
        String street,
        String number,
        String complement,
        String neighborhood,
        String city,
        String state,
        String postalCode,
        String country
) {
}
