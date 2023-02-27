package com.wedding.invites.wedding.controller;

import com.wedding.invites.wedding.service.WeddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WeddingController {

    @Autowired
    WeddingService weddingService;

    @GetMapping("/person/{personId}")
    public ResponseEntity<String> getPerson(@PathVariable String personId) {
        return ResponseEntity.ok().body(weddingService.fetchPerson(personId).toString());

    }
}
