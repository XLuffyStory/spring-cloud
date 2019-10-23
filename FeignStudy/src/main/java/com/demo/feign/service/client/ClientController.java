package com.demo.feign.service.client;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	private ServiceFeignInterface serviceFeignInterface;

	@RequestMapping("feign-hello")
	public String helloFeign() {
		return serviceFeignInterface.hello1();
	}

	@RequestMapping(value = "feign-hello/{name}", method = RequestMethod.GET)
	public String helloFeing2(@PathVariable("name") String name) {
		return serviceFeignInterface.hello2(name);
	}

	@RequestMapping(value = "feign-hello/idcheck", method = RequestMethod.GET)
	public String helloFeign3(@PathParam("id") String id) {
		return serviceFeignInterface.hello3(id);

	}

}
