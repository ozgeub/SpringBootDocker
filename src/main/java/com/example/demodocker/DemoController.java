package com.example.demodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/greet/{OZGE}")
	public String greeting(@PathVariable String name) {
		return "Hi Hello!!  " + name;
	}

}
