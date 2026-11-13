package com.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties (Paymentfacotry.class)
public class ProfileUseApplication {

	public static void main(String[] args) {
        ApplicationContext context  =SpringApplication.run(ProfileUseApplication.class, args);

    Paymentfacotry bean =	context.getBean(Paymentfacotry.class);

       System.out.println(  bean.getModeName());
	System.out.println( bean.getStatus());

	System.out.println( bean.getEnvironment());

	System.out.println( bean.getUrl());

// System.out.println(bean);
}

}
