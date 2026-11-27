package com.support.smart_customer_support.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@PostMapping("/register")
	public String register() {
		return "customer registered";
	}
	
	@PostMapping("/login")
	public String login() {
		return "customer login";
	}
}
