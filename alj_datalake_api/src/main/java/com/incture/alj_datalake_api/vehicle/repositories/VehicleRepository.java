package com.incture.alj_datalake_api.vehicle.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.incture.alj_datalake_api.vehicle.entities.VehicleMasterEntity;

public interface VehicleRepository extends JpaRepository<VehicleMasterEntity, String>{

	List<VehicleMasterEntity> findByOwnerId(String ownerId);
	
	VehicleMasterEntity findByVin(String vin);

	@Query("SELECT DISTINCT p.description FROM VehicleMasterEntity p ORDER BY p.description ASC")
	List<String> getAllModelDesc();
}
