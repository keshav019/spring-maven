package com.stackroute.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Welocome to JenkinDemo";
	}
	@GetMapping("/goodBy")
	public String sayGoodBy() {
		return "Good By";
	}
}
