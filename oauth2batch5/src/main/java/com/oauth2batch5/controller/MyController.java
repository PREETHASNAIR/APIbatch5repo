package com.oauth2batch5.controller;

import org.springframework.stereotype.Controller;

@Controller

public class MyController {
	
	@RequestMapping("/emplist")
	public String displayEmployee()
	{ return "employee.html";
	
	}
}
