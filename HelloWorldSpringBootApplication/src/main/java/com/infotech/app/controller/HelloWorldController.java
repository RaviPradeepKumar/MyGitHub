package com.infotech.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/")
	public String welcome(){
		return "Hello Spring Boot Application";
	}
}
