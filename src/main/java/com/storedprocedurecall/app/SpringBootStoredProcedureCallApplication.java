package com.storedprocedurecall.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.storedprocedurecall.app")
public class SpringBootStoredProcedureCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStoredProcedureCallApplication.class, args);
	}

}
