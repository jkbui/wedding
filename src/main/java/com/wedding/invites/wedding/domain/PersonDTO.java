package com.wedding.invites.wedding.domain;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PersonDTO {

    private UUID id;
    private String name;
    private String email;
    private int rsvp;
}
