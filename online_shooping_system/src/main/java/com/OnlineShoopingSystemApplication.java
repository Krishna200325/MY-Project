package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnlineShoopingSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(OnlineShoopingSystemApplication.class, args);
	
PaymentService service =	   context.getBean(PaymentService.class);
	
  service.processPayment();
}

}
