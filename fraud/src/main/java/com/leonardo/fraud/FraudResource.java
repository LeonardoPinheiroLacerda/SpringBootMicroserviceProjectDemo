package com.leonardo.fraud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.shared.dto.FraudCheckResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
public record FraudResource(FraudCheckService fraudCheckService) {

	@GetMapping(path = "{customerId}")
	public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId) {
		Boolean isFraudulentCustomer = fraudCheckService.isFraudumentCustomer(customerId);
		log.info("Fraud check request for customer {}", customerId);
		return new FraudCheckResponse(isFraudulentCustomer);
	}
	
}
