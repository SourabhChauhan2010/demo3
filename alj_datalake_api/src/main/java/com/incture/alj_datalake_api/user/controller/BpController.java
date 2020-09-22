package com.incture.alj_datalake_api.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.alj_datalake_api.user.services.BpService;

@RestController
@RequestMapping("alj/user/bp")
public class BpController {
	
	@Autowired
	BpService service;
	
	@GetMapping("/test")
	public String test() {
		return "BP service is running.";
	}
	
	@GetMapping("/id/{bpNo}")
	public ResponseEntity<?> searchBpByBpId(@PathVariable String bpNo) {
		System.err.println("> BP Number : " + bpNo);
		return service.searchBpByBpId(bpNo);
	}

}
