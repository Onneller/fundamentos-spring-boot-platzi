package com.fundamentosplatzi.springboot.fundamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FundamentosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(FundamentosApplication.class, args);
	}

}
