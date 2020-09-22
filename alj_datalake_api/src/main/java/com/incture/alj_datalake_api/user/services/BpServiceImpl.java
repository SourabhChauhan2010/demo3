package com.incture.alj_datalake_api.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.incture.alj_datalake_api.user.entities.BpEntity;
import com.incture.alj_datalake_api.user.repositories.BpRepository;

@Service
public class BpServiceImpl implements BpService {

	@Autowired
	BpRepository repository;

	@Override
	public ResponseEntity<?> searchBpByBpId(String bpNo) {
		BpEntity response = repository.findByBpNo(bpNo);
//		System.err.println("> BP response : " + response == null ? null : response.toString());
		
		if (response == null)
			return new ResponseEntity<>("No record found", HttpStatus.NO_CONTENT);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
