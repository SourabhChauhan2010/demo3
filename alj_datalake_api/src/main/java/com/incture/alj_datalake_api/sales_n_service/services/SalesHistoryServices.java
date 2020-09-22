package com.incture.alj_datalake_api.sales_n_service.services;

import org.springframework.http.ResponseEntity;

import com.incture.alj_datalake_api.sales_n_service.entities.SaleHistoryEntity;

public interface SalesHistoryServices {

	ResponseEntity<?> getHistoryByVIN(String vin);

	ResponseEntity<?> getHistoryByInvoiceNo(String invoiceNo);

	ResponseEntity<?> createSalesHistory(SaleHistoryEntity request);

}
