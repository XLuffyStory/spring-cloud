package com.demo.feign.service.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.demo.feign.service.ServiceServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Client {

	public static void main(String[] args) {
		// config spring boot to find service-client.properties or service-client.yml
		// under src/main/resources
		System.setProperty("spring.config.name", "service-client");
		SpringApplication.run(ServiceServer.class, args);
	}
}
