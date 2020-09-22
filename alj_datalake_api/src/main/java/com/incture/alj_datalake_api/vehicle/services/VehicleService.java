package com.incture.alj_datalake_api.vehicle.services;

import org.springframework.http.ResponseEntity;

public interface VehicleService {

	ResponseEntity<?> getAllVehicleDetails();

	ResponseEntity<?> getVehicleDetailsByOwnerId(String ownerId);

	ResponseEntity<?> getvehicleDetailsByVin(String vin);

	ResponseEntity<?> getAllModelDesc();

}
