package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(FirstProjectApplication.class, args);
		
//		Alien a = new Alien(); // this something that spring boot will give you
								// you need to work only on the logic
		Alien a = context.getBean(Alien.class);
		// when getBean is called , it will check in spring container, whether
		// there is an object for Alien (which is a spring bean now, becz we have used @Component)
		a.show();
		
		/*
		 * Alien a1 = context.getBean(Alien.class); // even this is given 2 times..the
		 * object is created only once // this is becz spring framework uses singleton
		 * a1.show();
		 */
	} 

}
