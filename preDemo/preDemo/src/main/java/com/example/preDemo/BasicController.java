package com.example.preDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@GetMapping("/hello")
	public String helloCompass() throws InterruptedException {
		Thread.sleep(2000);
		return "Hello Compass";
	}

	@GetMapping("/bye")
	public String byeCompass() {
		return "Bye Compass";
	}

	@GetMapping("/morning")
	public String morningCompass() {
		return "Good Morning Compass";
	}

	@PostMapping("/myName")
	public String myName(@RequestBody String myN) {
		return "Your name is "+myN;
	}
}
