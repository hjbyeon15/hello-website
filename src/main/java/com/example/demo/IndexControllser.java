package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControllser {
	@GetMapping("/")
	public String index() {
		return "Temporary Index";
	}

}
