package com.immortal.sol.app.kafka.publish.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immortal.sol.app.kafka.constants.KafkaTopics;
import com.immortal.sol.beans.web.dto.UserDto;

@RestController
public class KafkaPublisher {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	@GetMapping("/publishJson")
	public String publishUser() {
		
		UserDto user = new UserDto();
		
		kafkaTemplate.send(KafkaTopics.TOPIC_JSON, user);
		return " User Published Successfully";
	}

}
