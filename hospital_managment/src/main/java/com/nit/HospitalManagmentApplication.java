package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class HospitalManagmentApplication {

	public static void main(String[] args) {
		ApplicationContext context=
		SpringApplication.run(HospitalManagmentApplication.class, args);

		HospitalConfig bean =context.getBean(HospitalConfig.class);
		System.out.println(bean);
	}

}
