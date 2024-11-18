
package com.calix.bdh.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.calix.bdh.model.Location;
import com.calix.bdh.service.LocationService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class LocationMutation implements GraphQLMutationResolver {
	@Autowired
	private LocationService refLocationService;

	public Location addLocation(String subnetsV4, String subnetsV6, String name, String region, String address, String geo, String orgId, String tenantId) {
		Location refLocation = new Location();
		refLocation.setSubnetsV4(subnetsV4);
		refLocation.setSubnetsV6(subnetsV6);
		refLocation.setName(name);
		refLocation.setRegion(region);
		refLocation.setAddress(address);
		refLocation.setGeo(geo);
		refLocation.setOrgId(orgId);
		refLocation.setTenantId(tenantId);
		return refLocationService.saveLocation(refLocation);
	}

	public String deleteLocation(UUID id) {
		refLocationService.deleteLocationById(id);
		return "Location deleted";
	}
}