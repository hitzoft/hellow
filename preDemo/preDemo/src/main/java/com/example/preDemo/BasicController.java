package com.example.preDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	
	@GetMapping("/hello")
	public String helloCompass() {
		System.out.println("Insied helloCompass method");
		return "Hello Compass 3";
	}
	
	
	
}
