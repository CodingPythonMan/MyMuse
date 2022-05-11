package com.pultaeki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pultaeki.model.User;
import com.pultaeki.service.UserService;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	UserService userService;
	
	
	@GetMapping("/userList")
	public String list(Model model) {
		try {
		List<User> users = userService.selectList();
		model.addAttribute("users", users);
		
		System.out.println("userList 호출 : " + users.size());
		return "/userList";
		}
		catch(Exception e) {
			System.out.println(e.getMessage() +"////" +  e.getStackTrace());
			return "/userList";
		}
	}	
}
