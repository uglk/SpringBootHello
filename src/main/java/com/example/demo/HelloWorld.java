package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/")
	public String hello() {
		return "<h1>Hello Spring Boot!</h1>";
	}
	@GetMapping("/devops")
	public String devops() {
		return "<h1>Welcome to DevOps!</h1>";
	}

}
