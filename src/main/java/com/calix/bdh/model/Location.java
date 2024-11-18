package com.calix.bdh.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "ref_location")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private Timestamp deleteTime;
	private Boolean deleted;
	private String subnetsV4;
	private String subnetsV6;
	private String name;
	private String region;
	private String address;
	private String geo;
	private String orgId;
	private String tenantId;
	private Timestamp updateTime;
	private Timestamp createTime;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Timestamp getDeleteTime() {
        return deleteTime;
    }
    public void setDeleteTime(Timestamp deleteTime) {
        this.deleteTime = deleteTime;
    }
    public Boolean getDeleted() {
        return deleted;
    }
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public String getSubnetsV4() {
        return subnetsV4;
    }
    public void setSubnetsV4(String subnetsV4) {
        this.subnetsV4 = subnetsV4;
    }
    public String getSubnetsV6() {
        return subnetsV6;
    }
    public void setSubnetsV6(String subnetsV6) {
        this.subnetsV6 = subnetsV6;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGeo() {
        return geo;
    }
    public void setGeo(String geo) {
        this.geo = geo;
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
    public Timestamp getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
    public Timestamp getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

 
}