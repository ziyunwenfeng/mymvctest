package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class ClientController {
	@Value("${from}")
	String from;
	@RequestMapping("/from")
	public String from(){
		return this.from;
	}
}
