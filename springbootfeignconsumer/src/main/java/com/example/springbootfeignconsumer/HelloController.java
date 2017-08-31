package com.example.springbootfeignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="/feign-consumer",method=RequestMethod.GET)
	public String hellocontroller(){
		return helloService.hello();
	}
	
	@RequestMapping(value="/feign-consumer2",method=RequestMethod.GET)
	public String hellocontroller2(){
		String str = "";
		
		return 
				str+helloService.hello1("hello1 ")
				+helloService.hello2("hello2",12).getName()+" "
				+helloService.hello3(new User("hello3",16));
	}
	
	
}
