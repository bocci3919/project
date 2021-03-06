package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.feign.HelloFeign;

@RestController
public class HelloController {

	@Autowired
	private HelloFeign helloFeign;
	
	@RequestMapping("/index/{name}")
	public String index(@PathVariable String name) {
		return helloFeign.index(name);
	}
}
