package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FoodDeliverySystemApplication {

	
        public static void main(String[] args) {
                ApplicationContext context =  
		SpringApplication.run(FoodDeliverySystemApplication.class, args);

		FoodOrder order = context.getBean("foodOrder",FoodOrder.class);
		order.AllDetails();
		System.out.println("Succesfully deleivered");
	}

}
