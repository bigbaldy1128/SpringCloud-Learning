package com.wjz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class EurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignApplication.class, args);
	}

	//	@Bean
//	public RequestInterceptor headerInterceptor() {
//		return requestTemplate -> {
//            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
//                    .getRequestAttributes();
//            HttpServletRequest request = attributes.getRequest();
//            Enumeration<String> headerNames = request.getHeaderNames();
//            if (headerNames != null) {
//                while (headerNames.hasMoreElements()) {
//                    String name = headerNames.nextElement();
//                    String values = request.getHeader(name);
//                    requestTemplate.header(name, values);
//                }
//            }
//        };
//	}
}
