package com.professionalit.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaConsumer {

	@KafkaListener(topics = "product-topic", groupId = "product-group")
	public void consume(ConsumerRecord<String, String> record) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consumer1 :");
		System.out.println("Message   : " + record.value());
		System.out.println("Topic     : " + record.topic());
		System.out.println("Partition : " + record.partition());
		System.out.println("Offset    : " + record.offset());
		System.out.println("Key       : " + record.key());
		System.out.println("Timestamp : " + record.timestamp());
	}

	//@KafkaListener(topics = "product-topic", groupId = "product-group")
	public void consume2(ConsumerRecord<String, String> record) throws InterruptedException {
		
		System.out.println("Consumer2 :");
		System.out.println("Message   : " + record.value());
		System.out.println("Topic     : " + record.topic());
		System.out.println("Partition : " + record.partition());
		System.out.println("Offset    : " + record.offset());
		System.out.println("Key       : " + record.key());
		System.out.println("Timestamp : " + record.timestamp());
	}
}