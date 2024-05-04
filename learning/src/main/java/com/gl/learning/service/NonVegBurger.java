package com.gl.learning.service;

import org.springframework.stereotype.Service;

@Service
public class NonVegBurger implements Burger {

	@Override
	public String getBurger() {
		return "Non Veg Burger";
	}

	@Override
	public int getBurgerPrice() {
		return 200;
	}

}
