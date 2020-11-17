package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = { "com.example.model","com.example.controller", "com.example.repository"} )
public class LoginDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoginDemoApplication.class, args);
	}

}
