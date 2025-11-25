package com.ToDoList.infrastructure.persistence.repositories;

import com.ToDoList.infrastructure.persistence.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
