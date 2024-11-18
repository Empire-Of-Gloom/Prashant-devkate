package com.calix.bdh.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ref_organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orgId;
    private String tenantId;
    private String mappingPrecedence;
    private String nameFormat;
    private String subscriberMatchRule;
    private String realtimeLateflowDelay;
    private Integer retentionPeriodDays;
    private Integer templateTimeoutHours;
    private String aggregationRules;
    private String entitlement;
    private String orgAdditionalInfo;
    private Boolean enableSubscriberAssoc;
    private Boolean useAsmApplications;
    private Boolean allowOntReplacement;
    private Boolean deleted;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp deleteTime;
    private String clearFilterCache;
    private String aggGroupMappedBy;
    private Boolean enableRgOntSubscriberAssoc;

    // add all getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getMappingPrecedence() {
        return mappingPrecedence;
    }

    public void setMappingPrecedence(String mappingPrecedence) {
        this.mappingPrecedence = mappingPrecedence;
    }

    public String getNameFormat() {
        return nameFormat;
    }

    public void setNameFormat(String nameFormat) {
        this.nameFormat = nameFormat;
    }

    public String getSubscriberMatchRule() {
        return subscriberMatchRule;
    }

    public void setSubscriberMatchRule(String subscriberMatchRule) {
        this.subscriberMatchRule = subscriberMatchRule;
    }

    public String getRealtimeLateflowDelay() {
        return realtimeLateflowDelay;
    }

    public void setRealtimeLateflowDelay(String realtimeLateflowDelay) {
        this.realtimeLateflowDelay = realtimeLateflowDelay;
    }

    public Integer getRetentionPeriodDays() {
        return retentionPeriodDays;
    }

    public void setRetentionPeriodDays(Integer retentionPeriodDays) {
        this.retentionPeriodDays = retentionPeriodDays;
    }

    public Integer getTemplateTimeoutHours() {
        return templateTimeoutHours;
    }

    public void setTemplateTimeoutHours(Integer templateTimeoutHours) {
        this.templateTimeoutHours = templateTimeoutHours;
    }

    public String getAggregationRules() {
        return aggregationRules;
    }

    public void setAggregationRules(String aggregationRules) {
        this.aggregationRules = aggregationRules;
    }

    public String getEntitlement() {
        return entitlement;
    }

    public void setEntitlement(String entitlement) {
        this.entitlement = entitlement;
    }

    public String getOrgAdditionalInfo() {
        return orgAdditionalInfo;
    }

    public void setOrgAdditionalInfo(String orgAdditionalInfo) {
        this.orgAdditionalInfo = orgAdditionalInfo;
    }

    public Boolean getEnableSubscriberAssoc() {
        return enableSubscriberAssoc;
    }

    public void setEnableSubscriberAssoc(Boolean enableSubscriberAssoc) {
        this.enableSubscriberAssoc = enableSubscriberAssoc;
    }

    public Boolean getUseAsmApplications() {
        return useAsmApplications;
    }

    public void setUseAsmApplications(Boolean useAsmApplications) {
        this.useAsmApplications = useAsmApplications;
    }

    public Boolean getAllowOntReplacement() {
        return allowOntReplacement;
    }

    public void setAllowOntReplacement(Boolean allowOntReplacement) {
        this.allowOntReplacement = allowOntReplacement;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getClearFilterCache() {
        return clearFilterCache;
    }

    public void setClearFilterCache(String clearFilterCache) {
        this.clearFilterCache = clearFilterCache;
    }

    public String getAggGroupMappedBy() {
        return aggGroupMappedBy;
    }

    public void setAggGroupMappedBy(String aggGroupMappedBy) {
        this.aggGroupMappedBy = aggGroupMappedBy;
    }

    public Boolean getEnableRgOntSubscriberAssoc() {
        return enableRgOntSubscriberAssoc;
    }

    public void setEnableRgOntSubscriberAssoc(Boolean enableRgOntSubscriberAssoc) {
        this.enableRgOntSubscriberAssoc = enableRgOntSubscriberAssoc;
    }
}