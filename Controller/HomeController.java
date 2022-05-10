package com.pultaeki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pultaeki.model.User;
import com.pultaeki.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/userList")
	public String list(Model model) {
		List<User> users = userService.selectList();
		model.addAttribute("users", users);
		return "/userList";
	}
}
