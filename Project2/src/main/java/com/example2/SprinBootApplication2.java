package com.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class SprinBootApplication2 {

      @Autowired
	Environment environment;
	
	@Bean
	public Iplteam iplteam(){

		Iplteam iplteam = new Iplteam();
		iplteam.setNameOfBatsman(environment.getProperty("nameOfBatsman"));
		iplteam.setFavrtteam(environment.getProperty("favrtteam"));
		return  iplteam;
		
	}

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SprinBootApplication2.class, args);

           Cricket c = context.getBean("Cricketteam",Cricket.class);
	   System.out.println(c);

	   Iplteam iplteam = context.getBean("iplteam",Iplteam.class);
	   System.out.println(iplteam);

	}

}
