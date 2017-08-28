package com.example.demo1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Demo1Application {
	protected static Logger logger=LoggerFactory.getLogger(HelloController.class); 
	@RequestMapping("/")
	public String greet(){
		logger.debug("in the /");
		return "in the /";
	}
	@RequestMapping("/hello")
	public String greeting(){
		return "hello";
	}
	@RequestMapping("/user/{id}")
	public String greet2(@PathVariable("id") String id){
		return "hello "+id;
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
