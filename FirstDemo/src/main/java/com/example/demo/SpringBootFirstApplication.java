package com.example.demo;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class SpringBootFirstApplication {

	@Autowired
	private Environment environment;

	@Bean
	public Chip chip() {
	
		Chip chip = new Chip();
		chip.setChipCompany(environment.getProperty("chipCompany"));
		chip.setTypeOfChip(environment.getProperty("typeOfChip"));
		chip.setManufactureDate(environment.getProperty("manufactureDate"));
		return chip;
	}

	public static void main(String[] args) {
		
		
		 ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		
		  Chip bean = context.getBean("chip",Chip.class);
		  System.out.println(bean);
		  
		    Robot bean2 = context.getBean("Chitti-ROBO",Robot.class);
		    bean2.makeRobotActivate();
	}

}

