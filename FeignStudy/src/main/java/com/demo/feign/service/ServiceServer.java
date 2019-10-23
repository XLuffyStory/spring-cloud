package com.demo.feign.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceServer {

	public static void main(String[] args) {
		// config spring boot to find sersvice-server.properties or service-server.yml
		// under src/main/resources
		System.setProperty("spring.config.name", "service-server");
		SpringApplication.run(ServiceServer.class, args);
	}
}
