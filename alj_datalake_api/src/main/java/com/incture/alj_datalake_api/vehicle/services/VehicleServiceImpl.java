package com.incture.alj_datalake_api.vehicle.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.incture.alj_datalake_api.vehicle.entities.VehicleMasterEntity;
import com.incture.alj_datalake_api.vehicle.repositories.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository repository;

	@Override
	public ResponseEntity<?> getAllVehicleDetails() {
		System.err.println("> START :: getAllVehicleDetails method");
		List<VehicleMasterEntity> response = repository.findAll();

		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<?> getVehicleDetailsByOwnerId(String ownerId) {
		System.err.println("> START :: getVehicleDetailsByOwnerId method");
		
		List<VehicleMasterEntity> response = repository.findByOwnerId(ownerId);
		
		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getvehicleDetailsByVin(String vin) {
		System.err.println("> START :: getvehicleDetailsByVin method");
		
		VehicleMasterEntity response = repository.findByVin(vin);
		
		if (response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getAllModelDesc() {
		List<String> response = repository.getAllModelDesc();
		
		if (response.size() == 0 || response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
