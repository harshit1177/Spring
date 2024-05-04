package com.gl.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.learning.controller.BurgerController;
import com.gl.learning.service.VegBurger;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		
		var context = SpringApplication.run(LearningApplication.class, args);
		
		BurgerController burgerController =  context.getBean(BurgerController.class);
		
		System.out.println(burgerController.getBurger());
		
		//by default the creation type is singleton only one bean will be created and separate beans in the container
		// will refer to the same memory block 
		
		//prototype --> the no of times we create a bean a new memory block will created to it or a new instance will be created
	     
		VegBurger vegBurger = context.getBean(VegBurger.class);
		
		VegBurger vegBurger2 = (VegBurger) context.getBean("abc");
		
		System.out.println(vegBurger);
		System.out.println(vegBurger2);
		System.out.println(vegBurger.getBurger());
		
	}

}
