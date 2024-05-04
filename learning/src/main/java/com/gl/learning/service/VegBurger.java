package com.gl.learning.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("abc")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Primary
public class VegBurger implements Burger{
	
	@Override
	public String getBurger() {
		return "Veg Burger";
		
	}

	@Override
	public int getBurgerPrice() {
		return 100;
	}
	
	public void init() {
		System.out.println("inside the init method of Veg Burger");
	}
	
	public void destroy() {
		System.out.println("inside the destroy method of Veg Burger");
	}


}
