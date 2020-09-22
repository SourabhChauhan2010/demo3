package com.incture.alj_datalake_api.sales_n_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.alj_datalake_api.sales_n_service.entities.SaleHistoryEntity;
import com.incture.alj_datalake_api.sales_n_service.services.SalesHistoryServices;

@RestController
@RequestMapping("/alj/sales_history")
public class SalesHistoryController {

	@Autowired
	SalesHistoryServices service;
	
	@GetMapping("/test")
	public String test() {
		return "Sales History is running properly.";
	}
	
	@GetMapping("/vin/{vin}")
	public ResponseEntity<?> getHistoryByVIN(@PathVariable String vin) {
		return service.getHistoryByVIN(vin);
	}
	
	@GetMapping("/invoice/{invoiceNo}")
	public ResponseEntity<?> getHistoryByInvoiceNo(@PathVariable String invoiceNo) {
		return service.getHistoryByInvoiceNo(invoiceNo);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> createSalesHistory(@RequestBody SaleHistoryEntity request) {
		return service.createSalesHistory(request);
	}
}
