package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HospitalManagementSystemApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(HospitalManagementSystemApplication.class, args);

		Hospital hospital = context.getBean(Hospital.class);
		hospital.displayAllDetails();
	}

}
