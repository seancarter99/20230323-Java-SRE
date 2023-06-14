package com.skillstorm.demo.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.dtos.PaymentDto;

// This service doesn't make the payment, it just handles what happens the event of payment being handled
@Service
public class PaymentService {
	
	// RabbitTemplate is only needed for sending messages
	
	// @RabbitListener
	
	// This method will run whenever a message is received in one of the queues in the queue array
	@RabbitListener(queues = {"${queues.fanout}"})
	public void receivePaymentInfo(@Payload PaymentDto paymentInfo) {
		System.out.println("Payment User: " + paymentInfo.getUser());
		System.out.println("Payment Price: " + paymentInfo.getPrice());
	}
}
