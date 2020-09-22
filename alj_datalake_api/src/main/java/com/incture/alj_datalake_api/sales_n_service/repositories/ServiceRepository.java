package com.incture.alj_datalake_api.sales_n_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.alj_datalake_api.sales_n_service.entities.ServiceHistoryEntity;
import com.incture.alj_datalake_api.sales_n_service.entities.ServiceRefId;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceHistoryEntity, ServiceRefId> {

}
