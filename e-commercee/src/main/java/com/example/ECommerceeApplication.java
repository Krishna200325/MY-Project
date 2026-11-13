package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ECommerceeApplication {

	public static void main(String[] args) {
       ApplicationContext context =SpringApplication.run(ECommerceeApplication.class, args);


		ProductServiceProxy service = context.getBean(ProductServiceProxy.class);

		service.viewProduct(101);
		service.viewProductDetails(101);
		service.purchaseProduct(101 );
	}

}
