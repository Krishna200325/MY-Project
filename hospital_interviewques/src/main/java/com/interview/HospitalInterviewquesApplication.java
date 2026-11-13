package com.interview;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class HospitalInterviewquesApplication {

	@Autowired 
	Environment environment;


	@Bean 
	public Hospital hospital(){

		Hospital hospital = new Hospital();
		hospital.setContactNumber(environment.getProperty("hospital.contactNumber"));
		hospital.setHospitalName(environment.getProperty("hospital.hospitalName"));
		hospital.setContactPerson(environment.getProperty("hospital.contactPerson"));
		// hospital.setListOfTreatements(environment.getProperty("hospital.listOfTreatements"));
		hospital.setLocation(environment.getProperty("hospital.location"));
		hospital.setHospitalCode(environment.getProperty("hospital.hospitalCode",Integer.class));

	 
		return hospital;
	}
	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(HospitalInterviewquesApplication.class, args);

		Hospital hospital = context.getBean(Hospital.class);
		System.out.println(hospital);


		HospitalService service = context.getBean("services",HospitalService.class);
		int code = service.addHospital(hospital.getHospitalName(),hospital.getListOfTreatements(),hospital.getContactPerson(),hospital.getContactNumber(),hospital.getLocation());
                 System.out.println(code);
	     

		 Map<Integer,String>hospital1 = service.getHospital(code);
		 System.out.println(hospital1);


	      Hospital hospital4 = service.getHospitalDetails(102);
		   System.out.println(hospital4);
	}

}
