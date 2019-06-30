package com.arifng.dbmultitenancy.repository;

import com.arifng.dbmultitenancy.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rana on 30/6/19.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
