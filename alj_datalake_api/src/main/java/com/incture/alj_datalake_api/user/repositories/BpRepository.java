package com.incture.alj_datalake_api.user.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.alj_datalake_api.user.entities.BpEntity;

@Repository
public interface BpRepository extends JpaRepository<BpEntity, String> {

	BpEntity findByBpNo(String bpNo);
	
	List<BpEntity> findByBpRole(String bpRole);
}
