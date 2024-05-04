package com.gl.learning.service;

import org.springframework.stereotype.Component;

@Component
public interface Burger {
	
     String getBurger();
     
     int getBurgerPrice();
}
