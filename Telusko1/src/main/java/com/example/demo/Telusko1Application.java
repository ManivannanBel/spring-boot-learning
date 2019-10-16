package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Telusko1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Telusko1Application.class, args);
		
		Alien alien = context.getBean(Alien.class);
		
		alien.setId(1);
		alien.setName("CRX47");
		alien.setTechnology("Re");		
		System.out.println(alien.toString());
	}

}
