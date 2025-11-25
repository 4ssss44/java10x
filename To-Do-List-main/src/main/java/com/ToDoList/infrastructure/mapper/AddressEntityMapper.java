package com.ToDoList.infrastructure.mapper;

import com.ToDoList.core.entities.Address;
import com.ToDoList.infrastructure.persistence.AddressEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AddressEntityMapper {
    public AddressEntity toEntity(Address address) {
        return new AddressEntity(
                address.id(),
                address.country(),
                address.street(),
                address.number(),
                address.complement(),
                address.neighborhood(),
                address.city(),
                address.state(),
                address.postalCode(),
                UserEntityMapper.toEntity(address.user())
        );
    }

    public Address toDomain(AddressEntity addressEntity) {
        return new Address(
                addressEntity.getId(),
                UserEntityMapper.toDomain(addressEntity.getUser()),
                addressEntity.getCity(),
                addressEntity.getState(),
                addressEntity.getPostalCode(),
                addressEntity.getNeighborhood(),
                addressEntity.getComplement(),
                addressEntity.getStreet(),
                addressEntity.getCountry(),
                addressEntity.getNumber()
        );
    }
}
