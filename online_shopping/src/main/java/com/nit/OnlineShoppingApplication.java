package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnlineShoppingApplication {

	public static void main(String[] args) {
	ApplicationContext context	=
		SpringApplication.run(OnlineShoppingApplication.class, args);

	Shoppingconfig bean =	context.getBean(Shoppingconfig.class); 


	System.out.println(bean);
	}

}
