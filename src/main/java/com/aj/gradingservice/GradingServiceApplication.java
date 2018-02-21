package com.aj.gradingservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GradingServiceApplication {

    private static final Logger logger = LoggerFactory.getLogger(GradingServiceApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GradingServiceApplication.class,args);
	}
}
