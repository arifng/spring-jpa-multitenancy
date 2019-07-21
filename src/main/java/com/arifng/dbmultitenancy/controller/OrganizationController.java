package com.arifng.dbmultitenancy.controller;

import com.arifng.dbmultitenancy.model.Organization;
import com.arifng.dbmultitenancy.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by rana on 30/6/19.
 */
@RestController
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;

    @GetMapping(value = "/organization/{id}")
    public Organization getOrganization(@PathVariable("id") Long id) {
        Optional<Organization> organization = organizationService.findById(id);
        return organization.orElse(new Organization());
    }
}
