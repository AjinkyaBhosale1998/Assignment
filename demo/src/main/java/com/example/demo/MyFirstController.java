package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class MyFirstController {

	@GetMapping
	public String returnValue() {
		
		return "Hi welocme to My 1st Springboot Project ";
	
	}
	
}
