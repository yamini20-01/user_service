package com.swiggy.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/name")
	public String getName() {

		return "{name:'ram'},{name:'som'}";

	}

}
