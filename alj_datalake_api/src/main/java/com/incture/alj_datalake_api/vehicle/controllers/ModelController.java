package com.incture.alj_datalake_api.vehicle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.alj_datalake_api.vehicle.services.ModelService;

@RestController
@RequestMapping("alj/vehicle/model")
public class ModelController {
	
	@Autowired
	ModelService service;
	
	@GetMapping("/test")
	public String test() {
		return "Vehicle Model is running.";
	}
	
	@GetMapping("/productId/{productId}")
	public ResponseEntity<?> getModelByProductId(@PathVariable String productId) {
		return service.getModelByProductId(productId);
	}
	
	@GetMapping("/brand/{brand}")
	public ResponseEntity<?> getModelByBrand(@PathVariable String brand) {
		return service.getModelByBrand(brand);
	}

	@GetMapping("/type/{type}")
	public ResponseEntity<?> getModelByType(@PathVariable String type) {
		return service.getModelByType(type);
	}
	
	@GetMapping("/modelcode/{modelCode}")
	public ResponseEntity<?> getByModelCode(@PathVariable String modelCode) {
		return service.getModelByModelCode(modelCode);
	}
	
	@GetMapping("/fuel_type/{fuelType}")
	public ResponseEntity<?> getModelByFuelType(@PathVariable String fuelType) {
		return service.getModelByFuelType(fuelType);
	}
	
	@GetMapping("/year/{year}")
	public ResponseEntity<?> getModelByYear(@PathVariable String year) {
		return service.getModelByYear(year);
	}
}
