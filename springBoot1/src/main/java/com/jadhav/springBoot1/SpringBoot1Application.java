package com.jadhav.springBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBoot1Application.class, args);
		System.out.println("let's get start it........");

		// alien and alien1 both are same object
		Alien alien = applicationContext.getBean(Alien.class);
//		System.out.println(alien.hashCode());
		alien.code();

		Alien alien1 = applicationContext.getBean(Alien.class);
//		System.out.println(alien1.hashCode());

//		Laptop laptop = applicationContext.getBean(Laptop.class);
//		laptop.compiling();

		System.out.println("your job is done....");


	}

}
