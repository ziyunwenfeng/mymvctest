package com.example.demo1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class Demo1Application {
	protected static Logger logger=LoggerFactory.getLogger(HelloController.class); 

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
