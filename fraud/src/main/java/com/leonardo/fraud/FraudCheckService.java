package com.leonardo.fraud;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public record FraudCheckService(
		FraudCheckHistoryRepository fraudCheckHistoryRepository
) {

	public boolean isFraudumentCustomer(Integer customerId) {
		Boolean isFraudumentCustomer = false;
		
		fraudCheckHistoryRepository.save(
			FraudCheckHistory.builder()
				.isFraudster(isFraudumentCustomer)
				.customerId(customerId)
				.createdAt(LocalDateTime.now())
				.build()
		);
		return isFraudumentCustomer;
	}
	
}
