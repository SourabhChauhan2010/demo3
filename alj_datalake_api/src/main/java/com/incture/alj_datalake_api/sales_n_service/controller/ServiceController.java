package com.incture.alj_datalake_api.sales_n_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alj/service")
public class ServiceController {
	
	
//last service date by vin
//custom table for recom
// join table for last service date with vehicle details

	public String test() {
		return "Service is running.";
	}


}