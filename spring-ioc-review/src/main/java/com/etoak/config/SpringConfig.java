package com.etoak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.controller.UserController;
import com.etoak.service.UserService;

@Configuration
public class SpringConfig {
	
	@Bean
	public UserService userService(){
		return new UserService();
	}
	
	@Bean
	public UserController userController(){
		return new UserController();
	}
	
}
