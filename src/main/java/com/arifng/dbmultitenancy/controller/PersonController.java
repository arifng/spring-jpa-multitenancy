package com.arifng.dbmultitenancy.controller;

import com.arifng.dbmultitenancy.model.Person;
import com.arifng.dbmultitenancy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by rana on 30/6/19.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/employee/{id}")
    public Person getPerson(@PathVariable("id") Long id) {
        Optional<Person> person = personService.findById(id);
        return person.orElse(null);
    }
}
