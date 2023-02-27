package com.wedding.invites.wedding.repository;

import com.wedding.invites.wedding.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface PersonRepository extends CrudRepository<Person, UUID> {

    Optional<Person> findById(UUID id);
}
