package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployeeController {
	
	@RequestMapping(value = "/postEmployee", method = RequestMethod.POST)
	public @ResponseBody Employee postEmployeeData(@RequestBody Employee employee) {
 
		System.out.println("employee id  "+employee.getId());
		return employee;
	}
	
	@RequestMapping(value = "/emp")
	public String showEmployeePage(){
		return "employee";
	}
	
	@RequestMapping(value="employee", method=RequestMethod.POST)
    @ResponseBody
    
    public void savePerson(@RequestBody Employee[] employeeArray) {
		
	    for (Employee employee: employeeArray) {
	    	System.out.println("List: employee id  "+employee.getId());
	        
	        
	    }   
    }
	
	

}
