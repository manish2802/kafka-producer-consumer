package com.professionalit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.professionalit.kafka.producer.KafkaProducerService;

@RestController
public class ProductController {

	@Autowired
	private KafkaProducerService producer;

	@PostMapping("/send")
	public String publish(@RequestParam("message") String message) {
		System.out.println("Message: :" + message);
		producer.sendMessage(message);
		return "Message Published";
	}

}
