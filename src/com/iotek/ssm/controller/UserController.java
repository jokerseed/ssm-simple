package com.iotek.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/queryUserById")
	public String queryUserById(Integer id,HttpSession session) {
		User user = userService.findUserById(id);
		session.setAttribute("user", user);
		return "user";
	}
	
}







