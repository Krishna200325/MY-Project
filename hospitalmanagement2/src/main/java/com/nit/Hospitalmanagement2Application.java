package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class Hospitalmanagement2Application {

	

        public static void main(String[] args) {
		
		ApplicationContext context=
		SpringApplication.run(Hospitalmanagement2Application.class, args);

		HospitalService service = context.getBean( HospitalService.class);
		service.display();
	}

}
