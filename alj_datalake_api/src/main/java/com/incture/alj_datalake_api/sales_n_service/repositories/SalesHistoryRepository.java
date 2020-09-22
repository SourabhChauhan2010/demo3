package com.incture.alj_datalake_api.sales_n_service.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incture.alj_datalake_api.sales_n_service.entities.SaleHistoryEntity;
import com.incture.alj_datalake_api.sales_n_service.entities.SaleHistoryRefId;

@Repository
public interface SalesHistoryRepository extends JpaRepository<SaleHistoryEntity, SaleHistoryRefId> {

	List<SaleHistoryEntity> findByVin(String vin);
	
	List<SaleHistoryEntity> findByInvoiceNo(String invoiceNo);
	
	
}
