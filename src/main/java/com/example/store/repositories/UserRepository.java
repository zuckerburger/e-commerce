package com.example.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.store.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
