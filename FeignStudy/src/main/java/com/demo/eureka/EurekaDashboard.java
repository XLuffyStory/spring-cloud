package com.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDashboard {

	public static void main(String[] args) {

		// config the spring boot to look for the eureka-server.properties or
		// eureka-server.yml
		// under the src/main/resources
		System.setProperty("spring.config.name", "eureka-server");
		SpringApplication.run(EurekaDashboard.class, args);
	}

}
