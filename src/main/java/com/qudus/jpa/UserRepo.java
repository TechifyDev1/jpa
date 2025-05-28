package com.qudus.jpa;

import java.util.Optional;

import org.springframework.data.repository.Repository;

public interface UserRepo extends Repository<Person, Long> {

    Person save(Person person);
    Optional<Person> findById(long id);
}