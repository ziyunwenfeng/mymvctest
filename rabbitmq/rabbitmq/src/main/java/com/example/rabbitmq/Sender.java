package com.example.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
	@Autowired
	private AmqpTemplate template ;
	public void send(){
		String context = "hello";
		System.out.println("sender");
		this.template.convertAndSend("hello",context);
	}
}
