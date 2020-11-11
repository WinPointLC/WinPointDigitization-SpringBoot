package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class OrderController {

	
	
	/*
	 * @GetMapping("/") public String orderForm(@ModelAttribute Order myOrder){
	 * return "orderForm"; }
	 */
	  
	  @PostMapping("/saveOrder") public String saveOrder(Order order,
	  RedirectAttributes redirectAttributes){ //save to DB
		  System.out.println("Save to DB....");
		  
		  redirectAttributes.addFlashAttribute("placedOrder", order); //
		//  redirectAttributes.addFlashAttribute(o); //order 
		  return "redirect:/success_order";
	  }
	  
	  @GetMapping("/success_order") public String success(){
		  return "thankyou"; 
	  }
	 
	 
}