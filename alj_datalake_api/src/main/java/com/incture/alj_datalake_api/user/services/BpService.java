package com.incture.alj_datalake_api.user.services;

import org.springframework.http.ResponseEntity;

public interface BpService {

	ResponseEntity<?> searchBpByBpId(String bpNo);


}
