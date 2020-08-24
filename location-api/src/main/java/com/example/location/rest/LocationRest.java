package com.example.location.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.location.entitys.Location;
import com.example.location.dao.LocationDAO;

@RestController
@RequestMapping("/location")
@CrossOrigin(origins = "*")
public class LocationRest {
	
	@Autowired
	private LocationDAO locationDAO;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
	@GetMapping
	public ResponseEntity<List<Location>> getLocation(){
		List<Location> location = locationDAO.findAll();
		return ResponseEntity.ok(location);
	}
	
	@PostMapping
	public ResponseEntity<Location> createLocation (@RequestBody Location location){
		Location newLocation = locationDAO.save(location);
		return ResponseEntity.ok(newLocation);
	}
	
	@DeleteMapping(value = "{idLocation}")
	public ResponseEntity<Void> deleteLocation(@PathVariable("idLocation") Integer id){
		locationDAO.deleteById(id);
		return null;
	}

}
