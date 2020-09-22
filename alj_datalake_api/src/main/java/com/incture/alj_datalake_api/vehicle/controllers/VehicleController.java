package com.incture.alj_datalake_api.vehicle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.alj_datalake_api.vehicle.services.VehicleService;

@RestController
@RequestMapping("alj/vehicle")
public class VehicleController {
	
	@Autowired
	VehicleService service;

	@GetMapping("/test")
	public String test() {
		return "Vehicle Controller is running.";
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllVehicleDetails() {	
		return service.getAllVehicleDetails();
	}
	
	@GetMapping("/owner/{ownerId}")
	public ResponseEntity<?> getVehicleDetailsByOwnerId(@PathVariable String ownerId) {
		return service.getVehicleDetailsByOwnerId(ownerId);
	}
	
	@GetMapping("/vin/{vin}")
	public ResponseEntity<?> getvehicleDetailsByVin(@PathVariable String vin) {
		return service.getvehicleDetailsByVin(vin);
	}
	
	@GetMapping("/all/model")
	public ResponseEntity<?> getAllModelDesc() {
		return service.getAllModelDesc();
	}	
	
}
