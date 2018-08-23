package com.twlyplus.controller.domain;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.twlyplus.service.TreeService;
import com.twlyplus.service.UserService;

@Controller
@RequestMapping("/admin/tree")
public class AdminTreeController {

	@Resource
	private TreeService treeService;
	
	@Resource
	private UserService userService;
	
	
	/**
	 * /admin/tree/update
	 */
	@RequestMapping("/update")
	public String update(
			@RequestParam(value="id",required=false)String id,
			@RequestParam(value="treeids",required=false)String treeids,
			HttpServletRequest requset,HttpServletResponse response)throws Exception{
	 
		return null ;
	}
	
	
}
