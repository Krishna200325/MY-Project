package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class ECommerceApplication {

	

        public static void main(String[] args) {

		ApplicationContext context =
		SpringApplication.run(ECommerceApplication.class, args);

		ProductService service  = context.getBean(ProductService.class);
		System.out.println(service);
	}
	

}
