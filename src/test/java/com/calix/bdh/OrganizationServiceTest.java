package com.calix.bdh;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.calix.bdh.model.Organization;
import com.calix.bdh.repository.OrganizationRepository;
import com.calix.bdh.service.impl.OrganizationServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;


@ExtendWith(MockitoExtension.class)
public class OrganizationServiceTest {

    @InjectMocks
    private OrganizationServiceImpl organizationService; // Ensure this class exists

    @Mock
    private OrganizationRepository organizationRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveOrganization() {
        // Arrange
        Organization organization = new Organization();
        organization.setOrgId("100");
        organization.setTenantId("tenant012");
        organization.setNameFormat("nameFormat");
        organization.setSubscriberMatchRule("subscriberMatchRule");
        organization.setRealtimeLateflowDelay("realtimeLateflowDelay");
        organization.setAggregationRules("aggregationRules");
        organization.setEntitlement("entitlement");
        organization.setOrgAdditionalInfo("orgAdditionalInfo");
        organization.setClearFilterCache("clearFilterCache");
        organization.setAggGroupMappedBy("aggGroupMappedBy");

        when(organizationRepository.save(organization)).thenReturn(organization);

        // Act
        Organization savedOrganization = organizationService.saveOrganization(organization);

        // Assert
        assertEquals("100", savedOrganization.getOrgId());
        assertEquals("tenant012", savedOrganization.getTenantId());
        assertEquals("nameFormat", savedOrganization.getNameFormat());
        assertEquals("subscriberMatchRule", savedOrganization.getSubscriberMatchRule());
        assertEquals("realtimeLateflowDelay", savedOrganization.getRealtimeLateflowDelay());
        assertEquals("aggregationRules", savedOrganization.getAggregationRules());
        assertEquals("entitlement", savedOrganization.getEntitlement());
        assertEquals("orgAdditionalInfo", savedOrganization.getOrgAdditionalInfo());
        assertEquals("clearFilterCache", savedOrganization.getClearFilterCache());
        assertEquals("aggGroupMappedBy", savedOrganization.getAggGroupMappedBy());
    }

    @Test
    public void testDeleteOrganizationById() {
        // Arrange
        Long id = 1L;

        // Act
        organizationService.deleteOrganizationById(id);

        // Assert
        verify(organizationRepository).deleteById(id);
    }

    @Test
    public void testGetAllOrganizations() {
        // Arrange
        Organization organization1 = new Organization();
        organization1.setOrgId("100");
        Organization organization2 = new Organization();
        organization2.setOrgId("101");

        // Use Arrays.asList for Java 8
        List<Organization> organizations = Arrays.asList(organization1, organization2);

        when(organizationRepository.findAll()).thenReturn(organizations);

        // Act
        List<Organization> result = organizationService.getAllOrganizations();

        // Assert
        assertEquals(2, result.size());
        assertEquals("100", result.get(0).getOrgId());
        assertEquals("101", result.get(1).getOrgId());
    }

    @Test
    public void testGetOrganizationById_Exists() {
        Long id = 1L;
        Organization organization = new Organization();
        organization.setOrgId("100");
        when(organizationRepository.findById(id)).thenReturn(Optional.of(organization));

        Organization result = organizationService.getOrganizationById(id);

        assertEquals("100", result.getOrgId());
    }

    @Test
    public void testGetOrganizationById_NotExists() {
        Long id = 1L;
        when(organizationRepository.findById(id)).thenReturn(Optional.empty());

        Organization result = organizationService.getOrganizationById(id);

        assertNull(result);
    }
}