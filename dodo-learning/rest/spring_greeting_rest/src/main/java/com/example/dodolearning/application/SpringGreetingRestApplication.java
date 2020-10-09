package com.example.dodolearning.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.dodolearning")
public class SpringGreetingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGreetingRestApplication.class, args);
	}

}
