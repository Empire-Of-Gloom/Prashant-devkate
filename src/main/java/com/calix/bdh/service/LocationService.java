package com.calix.bdh.service;

import com.calix.bdh.model.Location;
import java.util.List;
import java.util.UUID;

public interface LocationService {
	Location saveLocation(Location refLocation);
	void deleteLocationById(UUID id);
	List<Location> findAll();
	Location findById(UUID id);

	List<Location> findByOrgId(String orgId);
}