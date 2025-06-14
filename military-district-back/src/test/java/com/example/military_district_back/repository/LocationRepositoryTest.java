package com.example.military_district_back.repository;

import com.example.military_district_back.model.Location;
import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class LocationRepositoryTest {
    @Autowired
    private Jdbi jdbi;

    @Test
    public void testInsertAndFind() {
        LocationRepository locationRepository = jdbi.onDemand(LocationRepository.class);

        Long locationId = locationRepository.insert("Moscow Base", 55.7558, 37.6173);

        Optional<Location> location = locationRepository.findById(locationId);
        assertTrue(location.isPresent());
        assertEquals("Moscow Base", location.get().getName());
        assertEquals(55.7558, location.get().getLatitude(), 0.0001);
        assertEquals(37.6173, location.get().getLongitude(), 0.0001);

        locationRepository.deleteById(locationId);
    }
}
