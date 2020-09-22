package com.incture.alj_datalake_api.vehicle.services;

import org.springframework.http.ResponseEntity;

public interface ModelService {

	ResponseEntity<?> getModelByProductId(String productId);

	ResponseEntity<?> getModelByBrand(String brand);

	ResponseEntity<?> getModelByType(String type);

	ResponseEntity<?> getModelByModelCode(String modelCode);

	ResponseEntity<?> getModelByFuelType(String fuelType);

	ResponseEntity<?> getModelByYear(String year);

}
