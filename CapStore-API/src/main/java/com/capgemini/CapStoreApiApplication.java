package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.capgemini.controller","com.capgemini.dao"})
public class CapStoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapStoreApiApplication.class, args);
		
	}
}
