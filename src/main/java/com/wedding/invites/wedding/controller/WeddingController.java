package com.wedding.invites.wedding.controller;

import com.wedding.invites.wedding.service.WeddingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class WeddingController {

    @Autowired
    WeddingService weddingService;

    @GetMapping("/{personId}")
    public ResponseEntity<String> getPerson(@PathVariable String personId) {
        return ResponseEntity.ok().body(weddingService.fetchPerson(personId).toString());

    }
}
