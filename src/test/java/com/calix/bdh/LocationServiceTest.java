package com.calix.bdh;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.calix.bdh.model.Location;
import com.calix.bdh.model.Organization;
import com.calix.bdh.repository.LocationRepository;
import com.calix.bdh.service.impl.LocationServiceImpl;

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
import java.util.UUID;


@ExtendWith(MockitoExtension.class)
public class LocationServiceTest {

    @InjectMocks
    private LocationServiceImpl locationService;

    @Mock
    private LocationRepository locationRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this); }
    @Test
    public void testSaveOrganization() {
        // Arrange
        Location location = new Location();
        location.setId(UUID.randomUUID());
        location.setName("Test Location");
        location.setAddress("123 Test Street");
        location.setRegion("Test Region");
        location.setTenantId("tenant012");
        location.setGeo("GeoData");
        location.setSubnetsV4("192.168.0.0/24");
        location.setSubnetsV6("2001:0db8:85a3:0000:0000:8a2e:0370:7334/64");


        when(locationRepository.save(location)).thenReturn(location);

        // Act
        Location savedLocation = locationService.saveLocation(location);

        // Assert
        assertNotNull(savedLocation);
        assertEquals(location.getId(), savedLocation.getId());
        assertEquals(location.getName(), savedLocation.getName());
        assertEquals(location.getAddress(), savedLocation.getAddress());
        assertEquals(location.getRegion(), savedLocation.getRegion());
        assertEquals(location.getTenantId(), savedLocation.getTenantId());
        assertEquals(location.getGeo(), savedLocation.getGeo());
        assertEquals(location.getSubnetsV4(), savedLocation.getSubnetsV4());
        assertEquals(location.getSubnetsV6(), savedLocation.getSubnetsV6());
    }
    @Test
    public void testDeleteLocationById() {
        // Arrange
        UUID locationId = UUID.randomUUID();

        // Act
        locationService.deleteLocationById(locationId);

        // Assert
        verify(locationRepository).deleteById(locationId);
    }

    @Test
    public void testGetAllLocations() {
        // Arrange
        Location location1 = new Location();
        location1.setId(UUID.randomUUID());
        location1.setName("Location 1");

        Location location2 = new Location();
        location2.setId(UUID.randomUUID());
        location2.setName("Location 2");

        List<Location> locations = Arrays.asList(location1, location2);
        when(locationRepository.findAll()).thenReturn(locations);

        // Act
        List<Location> result = locationService.findAll();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Location 1", result.get(0).getName());
        assertEquals("Location 2", result.get(1).getName());
    }

    @Test
    public void testGetLocationById_Exists() {
        // Arrange
        UUID locationId = UUID.randomUUID();
        Location location = new Location();
        location.setId(locationId);
        location.setName("Existing Location");

        when(locationRepository.findById(locationId)).thenReturn(Optional.of(location));

        // Act
        Location result = locationService.findById(locationId);

        // Assert
        assertNotNull(result);
        assertEquals(locationId, result.getId());
        assertEquals("Existing Location", result.getName());
    }

    @Test
    public void testGetLocationById_NotExists() {
        // Arrange
        UUID locationId = UUID.randomUUID();
        when(locationRepository.findById(locationId)).thenReturn(Optional.empty());

        // Act
        Location result = locationService.findById(locationId);

        // Assert
        assertNull(result);
    }

}