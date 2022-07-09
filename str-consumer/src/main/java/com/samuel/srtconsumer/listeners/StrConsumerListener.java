package com.samuel.srtconsumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.samuel.srtconsumer.custom.StrConsumerCostumListener;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class StrConsumerListener {

	@StrConsumerCostumListener(groupId = "group-1")
	public void create(String message) {
		log.info("CREATE ::: Receive message {}", message);
	}
	
	@StrConsumerCostumListener(groupId = "group-1")
	public void log(String message) {
		log.info("LOG ::: Receive message {}", message);
	}
	
	@KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validMessageContainerFactory")
	public void history(String message) {
		log.info("HISTORY ::: Receive message {}", message);
	}
}
