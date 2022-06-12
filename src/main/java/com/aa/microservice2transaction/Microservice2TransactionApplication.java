package com.aa.microservice2transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class Microservice2TransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2TransactionApplication.class, args);
	}

}
