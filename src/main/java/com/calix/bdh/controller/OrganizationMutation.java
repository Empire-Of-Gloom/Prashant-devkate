
package com.calix.bdh.controller;

import com.calix.bdh.model.Organization;
import com.calix.bdh.service.OrganizationService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrganizationMutation implements GraphQLMutationResolver {

    @Autowired
    private OrganizationService organizationService;

    public Organization addOrganization(String orgId, String tenantId, String mappingPrecedence, String nameFormat, 
                                        String subscriberMatchRule, String realtimeLateflowDelay, Integer retentionPeriodDays, 
                                        Integer templateTimeoutHours, String aggregationRules, String entitlement, 
                                        String orgAdditionalInfo, Boolean enableSubscriberAssoc, Boolean useAsmApplications, 
                                        Boolean allowOntReplacement, Boolean deleted, String clearFilterCache, 
                                        String aggGroupMappedBy, Boolean enableRgOntSubscriberAssoc) {
        Organization organization = new Organization();
        organization.setOrgId(orgId);
        organization.setTenantId(tenantId);
        organization.setMappingPrecedence(mappingPrecedence);
        organization.setNameFormat(nameFormat);
        organization.setSubscriberMatchRule(subscriberMatchRule);
        organization.setRealtimeLateflowDelay(realtimeLateflowDelay);
        organization.setRetentionPeriodDays(retentionPeriodDays);
        organization.setTemplateTimeoutHours(templateTimeoutHours);
        organization.setAggregationRules(aggregationRules);
        organization.setEntitlement(entitlement);
        organization.setOrgAdditionalInfo(orgAdditionalInfo);
        organization.setEnableSubscriberAssoc(enableSubscriberAssoc);
        organization.setUseAsmApplications(useAsmApplications);
        organization.setAllowOntReplacement(allowOntReplacement);
        organization.setDeleted(deleted);
        organization.setClearFilterCache(clearFilterCache);
        organization.setAggGroupMappedBy(aggGroupMappedBy);
        organization.setEnableRgOntSubscriberAssoc(enableRgOntSubscriberAssoc);
        return organizationService.saveOrganization(organization);
    }

    public String deleteOrganization(Long id) {
        organizationService.deleteOrganizationById(id);
        return "Organization deleted";
    }
}