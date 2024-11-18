package com.calix.bdh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calix.bdh.model.Location;
import com.calix.bdh.repository.LocationRepository;
import com.calix.bdh.service.LocationService;

import java.util.List;
import java.util.UUID;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocationById(UUID id) {
		locationRepository.deleteById(id);
	}

	@Override
	public List<Location> findAll() {
		return locationRepository.findAll();
	}

	@Override
	public Location findById(UUID id) {
		return locationRepository.findById(id).orElse(null);
	}

	@Override
	public List<Location> findByOrgId(String orgId) {
		return locationRepository.findByOrgId(orgId);
	}
}