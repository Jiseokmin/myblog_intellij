package com.example.myblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyblogApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyblogApplication.class, args);
	}


	@GetMapping
	public String HelloWorld() {
		return "Hello, World!123";
	}

}
