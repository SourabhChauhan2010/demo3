package com.incture.alj_datalake_api.vehicle.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.incture.alj_datalake_api.vehicle.entities.VehicleModelEntity;
import com.incture.alj_datalake_api.vehicle.repositories.VehicleModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

	@Autowired
	VehicleModelRepository repository;

	@Override
	public ResponseEntity<?> getModelByProductId(String productId) {
		VehicleModelEntity response = repository.findByProductId(productId);

		if (response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getModelByBrand(String brand) {
		List<VehicleModelEntity> response = repository.findByBrand(brand);

		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getModelByType(String type) {
		List<VehicleModelEntity> response = repository.findByType(type);

		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getModelByModelCode(String modelCode) {
		List<VehicleModelEntity> response = repository.findByZzvcModelCode(modelCode);

		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getModelByFuelType(String fuelType) {
		List<VehicleModelEntity> response = repository.findByZzvcFuelType(fuelType);

		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getModelByYear(String year) {
		List<VehicleModelEntity> response = repository.findByModelYear(year);

		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
