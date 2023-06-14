package com.skillstorm.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	// Fanout queue name
	@Value("${queues.fanout}") // Read
	private String fanoutQueueName;
	
	@Value("${exchanges.fanout}") // What is written to
	private String fanoutExchangeName;
	
	// If you have multiple exchanges or queues, you can still auto wire them specifically using
	// @Qualifier("bean-name")
	@Bean
	public Exchange exchange() {
		return new FanoutExchange(fanoutExchangeName);
	}
	
	@Bean(name = "fanoutQueue")
	public Queue queue() {
		return new Queue(fanoutQueueName);
	}
	
	// Create a "binding" of the queue to the exchange
	@Bean //                            Autowired in
	public Binding bindQueueToExchange(FanoutExchange exchange, Queue queue) {
		return BindingBuilder.bind(queue).to(exchange);
	}
	
	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}
}
