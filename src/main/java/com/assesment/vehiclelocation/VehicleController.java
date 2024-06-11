package com.assesment.vehiclelocation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

	@Autowired
	VehicleService service;

	@GetMapping("/getVehicles")
	public ResponseEntity<List<VehicleLocation>> getAllVehicles() {
		return new ResponseEntity<List<VehicleLocation>>(service.getAllVehicles(), HttpStatus.OK);
	}

	@PostMapping("/vehicle")
	public ResponseEntity<VehicleLocation> createVehicle(@RequestBody VehicleLocation vehicleLocation) {
		return new ResponseEntity<VehicleLocation>(service.createVehicle(vehicleLocation), HttpStatus.CREATED);
	}

	@PostMapping("/generateLoc")
	public ResponseEntity<VehicleLocation> generateLoc(@RequestBody VehicleLocation vehicleLocation) {
		return new ResponseEntity<VehicleLocation>(service.generateLocation(vehicleLocation), HttpStatus.CREATED);
	}
}
