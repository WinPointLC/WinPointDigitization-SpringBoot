package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.Customer;

@Controller
public class CustomerController {

	@GetMapping("/")
	public String showForm(@ModelAttribute Customer customer) {
		return "add_customer";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(Customer customer, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("addedCustomer", customer);
		return "redirect:/success";

	}

	@GetMapping("/success")
	public String success() {
		return "show_customer";
	}

	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public @ResponseBody Customer postEmployeeData(@RequestBody Customer customer) {

		System.out.println("customer name  " + customer.getFirstName());
		System.out.println("customer country  " + customer.getAddress().getCountry());
		return customer;
	}

}
