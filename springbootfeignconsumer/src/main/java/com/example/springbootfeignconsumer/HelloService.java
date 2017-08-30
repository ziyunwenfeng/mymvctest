package com.example.springbootfeignconsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloService {
	@RequestMapping("/hello")
	String hello();
}
