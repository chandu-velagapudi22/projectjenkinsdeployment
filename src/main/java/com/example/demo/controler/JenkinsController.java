package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	@GetMapping("/wel")
	public String getWel() {
		System.out.println("I am getwel()");
		return "welcome chandu";
	}

	@GetMapping("/hai")
	public String gethai() {
		System.out.println("I am gethai()");
		return "hi chandu";
	}

	@GetMapping("/bye")
	public String getBye() {
		System.out.println("I am getBye()");
		return "Bye chandu";
	}

}
