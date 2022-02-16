package com.bootcamp.yankiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YankiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(YankiServiceApplication.class, args);
	}

}
