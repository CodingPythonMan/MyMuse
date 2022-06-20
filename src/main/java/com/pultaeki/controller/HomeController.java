package com.pultaeki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/coverLetter")
	public String cover() {
		return "/coverLetter";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
}
