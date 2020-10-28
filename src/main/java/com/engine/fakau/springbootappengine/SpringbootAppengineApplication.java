package com.engine.fakau.springbootappengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringbootAppengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppengineApplication.class, args);
	}
	@GetMapping("/test")
	public String helloWorld(){
		return "Hello world, the test works  successfully";
	}

}
