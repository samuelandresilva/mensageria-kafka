package com.samuel.srtconsumer.exceptions;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ErrorCustomHandler implements KafkaListenerErrorHandler {

	@Override
	public Object handleError(Message<?> message, ListenerExecutionFailedException e) {
		log.info("EXCEPTION_HANDLER ::: Capturei um erro");
<<<<<<< HEAD
		log.info("Payload ::: {}", message.getPayload());
		log.info("Headers ::: {}", message.getHeaders());
		log.info("Offset ::: {}", message.getHeaders().get("kafka_offset"));
		log.info("Message Exception ::: {}", e.getMessage());
=======
>>>>>>> 1c76542476faf9f737369f7bb1b78aee0ff79fa3
		return null;
	}
	
//	@Override
//	public Object handleError(Message<?> message, ListenerExecutionFailedException exception, Consumer<?, ?> consumer) {
//		// TODO Auto-generated method stub
//		return KafkaListenerErrorHandler.super.handleError(message, exception, consumer);
//	}
	
}
