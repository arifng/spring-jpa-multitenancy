package com.arifng.dbmultitenancy.service.impl;

import com.arifng.dbmultitenancy.model.Person;
import com.arifng.dbmultitenancy.repository.PersonRepository;
import com.arifng.dbmultitenancy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by rana on 30/6/19.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }
}
