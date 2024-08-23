package com.msqljpa.JPAWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JpaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaWebApplication.class, args);
	}

	@RestController
	class dummy{
		@GetMapping("/")
		public String hello(){
			return "<H1>hello</H1>";
		}
	}

}
