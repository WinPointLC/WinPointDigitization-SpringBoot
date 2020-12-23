package com.winpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class )
@SpringBootApplication
public class WinPointManagementSystemApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(WinPointManagementSystemApplication.class, args);
	}

}
