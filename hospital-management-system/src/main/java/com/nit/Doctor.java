package com.nit;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data 
public class Doctor {
 


        @Value ("${name}")
        private String name;

        public void drName(){
                System.out.println("Doctor name: " +name);
        }
        
        
}
