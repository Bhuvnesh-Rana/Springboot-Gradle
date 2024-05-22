package com.GradleDemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradleDemoApplication {

	private static Logger logger=LoggerFactory.getLogger(GradleDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GradleDemoApplication.class, args);
		logger.info("Started the application..");
	}

}
