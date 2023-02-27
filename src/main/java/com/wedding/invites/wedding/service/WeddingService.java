package com.wedding.invites.wedding.service;

import com.wedding.invites.wedding.domain.Person;
import com.wedding.invites.wedding.domain.PersonDTO;
import com.wedding.invites.wedding.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class WeddingService {

    @Autowired
    PersonRepository personRepository;

    public PersonDTO fetchPerson(String id) {
        var person = personRepository.findById(UUID.fromString(id));
        if (person.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Did not find id: %s" + id);
        }
        return mapIntoDTO(person.get());
    }

    private PersonDTO mapIntoDTO(Person person){
        return PersonDTO.builder().name(person.getName()).rsvp(person.getRsvp()).email(person.getEmail()).id(person.getId()).build();
    }
}
