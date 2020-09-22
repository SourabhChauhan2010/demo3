package com.incture.alj_datalake_api.vehicle.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.alj_datalake_api.vehicle.entities.VehicleModelEntity;
import com.incture.alj_datalake_api.vehicle.entities.VehicleModelId;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModelEntity, VehicleModelId> {

	VehicleModelEntity findByProductId(String productId);
	
	List<VehicleModelEntity> findByBrand(String brand);
	
	List<VehicleModelEntity> findByModelYear(String year);
	
	List<VehicleModelEntity> findByType(String type);
	
	List<VehicleModelEntity> findByZzvcFuelType(String fuelType);
	
	List<VehicleModelEntity> findByZzvcModelCode(String modelCode);
}
