package com.date.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api") //localhost:5000/api/hello
public class RootController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Word!";
	}
}
