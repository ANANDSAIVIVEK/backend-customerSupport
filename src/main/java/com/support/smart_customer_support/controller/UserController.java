package com.support.smart_customer_support.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@GetMapping("/{id}")
	public String getProfile(@PathVariable Long id) {
		return "Customer Profile: "+ id;
	}
	
	@PutMapping("/{id}")
	public String updateProfile(@PathVariable Long id) {
		return "Customer Updated: "+ id;
	}
}
