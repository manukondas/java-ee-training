package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	
	@GetMapping
	@RequestMapping("/hello/{group}")
	public String sayhello(HttpServletRequest request, @RequestParam String name, @PathVariable String group) {
		System.out.println(request.getLocalAddr());
		System.out.println(name);
		System.out.println(group);
		return "welcome";
	} 

}
