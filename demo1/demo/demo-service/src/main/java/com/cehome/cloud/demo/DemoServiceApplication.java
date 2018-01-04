package com.cehome.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//-- provider and consumer  service
@EnableEurekaClient
//@EnableFeignClients(basePackages = {"com.cehome.cloud"})
@ComponentScan("com.cehome.cloud.demo")
public class DemoServiceApplication {

	public static void main(String[] args) {
 
		SpringApplication.run(DemoServiceApplication.class);
	}
}
