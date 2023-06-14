package com.skillstorm.demo.services;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.dtos.PaymentDto;

@Service
public class PaymentService {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	private Exchange fanout;
	
	public void processPayment(double price, String user) {
		// Create a DTO to send the JSON data
		
		
		//                            Direct
//		rabbitTemplate.convertAndSend(queue.getName(), new Object());
		
        //      Send it to my fanout 
		rabbitTemplate.convertAndSend(fanout.getName(), new PaymentDto(user, price));
	}
}
