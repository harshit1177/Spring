package com.gl.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.gl.learning.service.Burger;


@Controller

//servers will expect mappings over here in the file
public class BurgerController {

	// Field Injection
	// @Autowired
	private Burger burger;
	
	// Constructor injection
	@Autowired
	public BurgerController(@Qualifier("nonVegBurger")Burger burger) {
		this.burger = burger;
	}

	public String getBurger() {
		return burger.getBurger();
	}
	
	public void init() {
		System.out.println("inside the init method of Burger Controller ");
	}
	
	public void destroy() {
		System.out.println("inside the destroy method  of Burger Controller");
	}
}
