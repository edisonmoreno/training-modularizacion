package com.edisonmoreno.usecase;

import com.edisonmoreno.model.Customer;

import java.util.UUID;

public class CustomerUseCase {
    public Customer Save(Customer customer){
        return customer.toBuilder()
                .id(UUID.randomUUID().toString())
                .name(customer.getName())
                .lastname(customer.getLastname())
                .fullName(customer.getName().concat(" ").concat(customer.getLastname()))
                .build();
    }
}
