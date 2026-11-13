package com.nit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data 
public class Department {
        

        @Value("${department}")
        private String department;

        public void displayDartment(){

                System.out.println("Department Name: " +department);
        }
}
