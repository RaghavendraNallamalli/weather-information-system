package com.example.locationmicroservice.controller;

import com.example.locationmicroservice.model.Location;
import com.example.locationmicroservice.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {
    private final LocationRepository locationRepository;
    
    @Autowired
    public LocationController(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
    
    @GetMapping
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
    
    @PostMapping
    public Location addLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }
    
    // Implement other CRUD operations (update, delete) as needed
}
