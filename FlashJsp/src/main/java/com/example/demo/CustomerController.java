package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
		
	
	  @GetMapping("/") 
	  public String showForm(@ModelAttribute Customer customer,@ModelAttribute Order order)
	  {
		  return "add_customer";
	  }
	 
	  
		/*
		 * @PostMapping("/saveCustomer") public String saveCustomer(Customer
		 * customer,RedirectAttributes redirectAttributes) {
		 * redirectAttributes.addFlashAttribute("addedCustomer",customer); return
		 * "redirect:/success";
		 * 
		 * }
		 */
	  
	  @PostMapping("/saveForm") 
	  public String saveForm(Customer customer,Order order,RedirectAttributes redirectAttributes)
	  {
		  redirectAttributes.addFlashAttribute("addedCustomer",customer); 
		  redirectAttributes.addFlashAttribute("addedOrder",order); 
		  return "redirect:/success";
		  
	  }
	  
	  @GetMapping("/success")
	  public String success(){
		  return "show_customer"; 
	  }
	  
		
	  @RequestMapping(value = "/add-customer", method = RequestMethod.POST)
	  public @ResponseBody Customer postCustomerData(@RequestBody Customer customer) 
	  {
		  	  System.out.println("customer name  "+customer.getFirstName());
			  System.out.println("customer country  "+customer.getAddress().getCountry());
			  return customer; 
	  }
	  
	  @RequestMapping(value = "/add-order", method = RequestMethod.POST)
	  public @ResponseBody Order postOrderData(@RequestBody Order order) 
	  {
		  	  System.out.println("product name  " + order.getProductName());
			
			  return order; 
	  }

}
