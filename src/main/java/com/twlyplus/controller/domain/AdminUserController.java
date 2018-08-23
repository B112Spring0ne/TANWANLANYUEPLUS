package com.twlyplus.controller.domain;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twlyplus.domain.User;
import com.twlyplus.service.UserService;

@Controller
@RequestMapping("/admin/user")
public class AdminUserController {
	
	@Resource
	private UserService userService;
	
	
	@RequestMapping("/add")
	public String add(User user, HttpServletResponse response, HttpServletRequest request) throws Exception {
		return null;
}
}