package com.aj.gradingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GradingServiceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GradingServiceApplication.class,args);
	}
}
