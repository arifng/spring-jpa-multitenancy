package com.arifng.dbmultitenancy.service.impl;

import com.arifng.dbmultitenancy.model.Organization;
import com.arifng.dbmultitenancy.repository.OrganizationRepository;
import com.arifng.dbmultitenancy.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by rana on 30/6/19.
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public Optional<Organization> findById(Long id) {
        return organizationRepository.findById(id);
    }
}
