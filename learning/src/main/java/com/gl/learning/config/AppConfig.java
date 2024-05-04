package com.gl.learning.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gl.learning.controller.BurgerController;
import com.gl.learning.service.Burger;
import com.gl.learning.service.VegBurger;

@Configuration
public class AppConfig {

	
	//this will tell spring container that a new object is created and you have to manage it 
	@Bean(initMethod= "init", destroyMethod = "destroy")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Burger vegBurger() {
		return new VegBurger();
	}
	
	@Bean(initMethod= "init", destroyMethod = "destroy")
	public BurgerController burgerController() {
		return new BurgerController(vegBurger());
	}
	
}
