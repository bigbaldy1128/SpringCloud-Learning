package com.wjz;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Trace2Application {
	private final Logger logger= Logger.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(Trace2Application.class, args);
	}

	@GetMapping("/trace-2")
	public String trace(){
		logger.info("===<call trace-1>===");
		return "Trace";
	}
}
