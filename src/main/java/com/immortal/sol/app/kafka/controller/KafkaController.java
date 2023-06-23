package com.immortal.sol.app.kafka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	@GetMapping("/health-check")
	public String healthCheck() {
		return "Application is up and running";
	}

}
