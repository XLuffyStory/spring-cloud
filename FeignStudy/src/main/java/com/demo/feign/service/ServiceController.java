package com.demo.feign.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@RequestMapping("hello")
	public String hello1() {
		return "Hello World!";
	}

	@RequestMapping("hello/{name}")
	public String hello2(@PathVariable("name") String name) {
		return "Hello " + name + "!";
	}

	@RequestMapping("hello/idcheck")
	public String hello3(@RequestParam("id") String id) {
		return "ID=" + id;
	}

}
