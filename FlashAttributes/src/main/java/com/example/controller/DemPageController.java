package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DemPageController {
	
	@GetMapping("/")
    public String orderForm(@ModelAttribute Order myOrder){
        return "orderForm";
    }
	
	@PostMapping("/saveOrder")
	public String saveOrder(Order order, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("placed Order" , order);
		System.out.println("save to dB");
		return "redirect:/success";
	}
	@GetMapping("/success")
	public String success() {
		return "thankYou";
	}

}
