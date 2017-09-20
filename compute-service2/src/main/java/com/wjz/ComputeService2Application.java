package com.wjz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ComputeService2Application {

	public static void main(String[] args) {
		SpringApplication.run(ComputeService2Application.class, args);
	}
}
