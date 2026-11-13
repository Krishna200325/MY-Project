package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmplyoeemanagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(EmplyoeemanagementApplication.class, args);

        Emplyoee emp = context.getBean(Emplyoee.class);

        System.out.println(emp);
    }
}