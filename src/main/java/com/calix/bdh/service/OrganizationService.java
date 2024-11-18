
package com.calix.bdh.service;

import com.calix.bdh.model.Organization;

import java.util.List;

public interface OrganizationService {
    Organization saveOrganization(Organization organization);
    void deleteOrganizationById(Long id);
    List<Organization> getAllOrganizations();
    Organization getOrganizationById(Long id);
    // ...existing code...
}