package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	@RequestMapping(value = "/")
	public String showEmpPage() {
		return "EmployeeDashboard-New";
		
	}
	
	@RequestMapping(value = "AllUser")
	public String showAllUserPage() {
		return "AllUser";
		
	}
	
}
