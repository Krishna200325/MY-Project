package com.nit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data
public class Patient {
       

        @Value("${patientName}")
        private String patientName;

        public void patienname(){
                System.out.println("Patient name: " +patientName);
        }
}
