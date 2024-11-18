package com.calix.bdh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.calix.bdh.model.Location;
import com.calix.bdh.service.LocationService;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;
import java.util.UUID;

@Component
public class LocationQuery implements GraphQLQueryResolver {
	@Autowired
	private LocationService locationService;

	public List<Location> getAllLocations() {
		return locationService.findAll();
	}

	public Location getLocationById(UUID id) {
		return locationService.findById(id);
	}

	public List<Location> getLocationByOrgId(String orgId) {
		return locationService.findByOrgId(orgId);
	}
}