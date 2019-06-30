package com.arifng.dbmultitenancy.service;

import com.arifng.dbmultitenancy.model.Person;

import java.util.Optional;

/**
 * Created by rana on 30/6/19.
 */
public interface PersonService {
    Optional<Person> findById(Long id);
}
