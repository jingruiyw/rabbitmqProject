package com.jr.rabbitmq;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {
		run(ProducerApplication.class, args);
	}
}
