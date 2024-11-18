
package com.calix.bdh.controller;

import com.calix.bdh.model.Organization;
import com.calix.bdh.service.OrganizationService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrganizationQuery implements GraphQLQueryResolver {
    @Autowired
    private OrganizationService organizationService;

    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganizations();
    }

    public Organization getOrganizationById(Long id) {
        return organizationService.getOrganizationById(id);
    }
}