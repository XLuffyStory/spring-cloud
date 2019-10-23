package com.demo.feign.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("test-service")
//Work with Eureka, here the test-service is the spring.application.name  specified in the service-server.yml file
//and the test-service is shown in the Eureka server 

//@FeignClient(name = "service", url ="http://localhost:2222")
//not work with Eureka version, the name is mandatory that you can specify as you wish
//but the url should be the service's URL(can refer the service-server.yml file)
public interface ServiceFeignInterface {

	// below we use FeignClient to bind to service endpoint

	@RequestMapping("hello")
	public String hello1();

	@RequestMapping("hello/{name}")
	public String hello2(@PathVariable("name") String name);

	@RequestMapping("hello/idcheck")
	public String hello3(@RequestParam("id") String id);

}
