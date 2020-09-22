package com.incture.alj_datalake_api.sales_n_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.incture.alj_datalake_api.sales_n_service.entities.SaleHistoryEntity;
import com.incture.alj_datalake_api.sales_n_service.repositories.SalesHistoryRepository;

@Service
public class SalesHistoryServiceImpl implements SalesHistoryServices {
	
	@Autowired
	SalesHistoryRepository repository;

	@Override
	public ResponseEntity<?> getHistoryByVIN(String vin) {
		if(vin == null || vin.isEmpty()) {
			return new ResponseEntity<>("VIN must not be null or blank.", HttpStatus.BAD_REQUEST);
		}
			
		List<SaleHistoryEntity> response = repository.findByVin(vin);
		
		if(response.size() == 0) return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);
			
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getHistoryByInvoiceNo(String invoiceNo) {
		if(invoiceNo == null || invoiceNo.isEmpty()) {
			return new ResponseEntity<>("VIN must not be null or blank.", HttpStatus.BAD_REQUEST);
		}
			
		List<SaleHistoryEntity> response = repository.findByInvoiceNo(invoiceNo);
		
		if(response.size() == 0) return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);
			
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> createSalesHistory(SaleHistoryEntity request) {
		
		System.err.println("Request Body : " + request.toString());
		SaleHistoryEntity savedRecord = null;
		
		if(request != null) {
			savedRecord = repository.save(request);
		}
		
		if(savedRecord == null) return new ResponseEntity<>("Something went wrong. Please contact to administrator.", HttpStatus.INTERNAL_SERVER_ERROR);
		
		return new ResponseEntity<>(savedRecord, HttpStatus.CREATED);
	}

}
