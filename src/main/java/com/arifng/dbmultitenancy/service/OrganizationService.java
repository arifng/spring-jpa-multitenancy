package com.arifng.dbmultitenancy.service;

import com.arifng.dbmultitenancy.model.Organization;

import java.util.Optional;

/**
 * Created by rana on 30/6/19.
 */
public interface OrganizationService {
    Optional<Organization> findById(Long id);
}
