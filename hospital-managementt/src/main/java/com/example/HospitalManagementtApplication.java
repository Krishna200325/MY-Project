package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class HospitalManagementtApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(HospitalManagementtApplication.class, args);

        MedicalRecordServiceProxy proxy = context.getBean(MedicalRecordServiceProxy.class);

	   System.out.println("---- DOCTOR VIEW RECORD ----");
             proxy.viewPatientRecord(101);


        System.out.println("\n---- DOCTOR UPDATE RECORD ----");
	     proxy.updatePatientRecord(101, "Fever");


        System.out.println("\n---- DOCTOR DELETE RECORD ----");
	      proxy.deletePatientRecord(101);
}

}
