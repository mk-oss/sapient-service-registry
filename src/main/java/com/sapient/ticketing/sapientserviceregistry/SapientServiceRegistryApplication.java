package com.sapient.ticketing.sapientserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SapientServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapientServiceRegistryApplication.class, args);
	}

}
