package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
@EnableConfigurationProperties(DatacConfig.class)
public class DatabaseManagementApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(DatabaseManagementApplication.class, args);
	
	DatacConfig bean  =context.getBean(DatacConfig.class);
	
	System.out.println(bean.getDriverClassName());
	System.out.println(bean.getUrl());
	System.out.println(bean.getUsername());
	System.out.println(bean.getPassword());
	System.out.println(bean.getEnvironment());
	}

}
